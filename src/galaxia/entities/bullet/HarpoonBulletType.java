package galaxia.entities.bullet;

import arc.Core;
import arc.graphics.g2d.TextureRegion;
import arc.math.Mathf;
import arc.struct.Seq;
import mindustry.content.StatusEffects;
import mindustry.entities.Lightning;
import mindustry.entities.Units;
import mindustry.entities.bullet.BulletType;
import mindustry.gen.Bullet;
import mindustry.gen.Groups;
import mindustry.gen.Hitboxc;
import mindustry.gen.Unit;
import mindustry.type.StatusEffect;
import mindustry.type.UnitType;

import java.util.Objects;

public class HarpoonBulletType extends BulletType {
    public float shredDamage = 0;
    public float dischargeChance = 0.015f;
    public float ripDamage = 5;
    public float tearDamage = 65;
    public boolean dischargeLightning = true;
    public StatusEffect bleedEffect = StatusEffects.none;
    public float bleedEffectDuration = 60;
    public TextureRegion chainRegion;
    public boolean harpoonStuck;
    public boolean harpoonRetracting;
    public float relativeRotation;
    public float distanceOffset;

    public HarpoonBulletType(float speed, float damage) {
        super(speed, damage);
        lightningDamage = 3;
        lightningLength = 5;
        reflectable = absorbable = hittable = false;
    }

    @Override
    public void load() {
        super.load();
        chainRegion = Core.atlas.find("chain");
    }

    public void updateUnitEffect(Bullet b, Unit unit) {
        if (dischargeLightning && Mathf.chance(dischargeChance)) {
            Lightning.create(b.team, lightningColor, lightningDamage < 0 ? damage : lightningDamage, unit.x, unit.y, unit.rotation() + Mathf.range(lightningCone/2) + lightningAngle, lightningLength + Mathf.random(lightningLengthRand));
        }
    }

    public void resetHarpoon(Bullet b){
        if (b.owner instanceof UnitType ownerType) {
            harpoonRetracting = true;
        }
    }

    public void hitEntity(Bullet b, Hitboxc other, float initialHealth, UnitType ownerType, boolean harpoonStuck, boolean harpoonRetracting, float hitSize) {
        super.hitEntity(b, other, initialHealth);

        Unit u = Units.closestEnemy(b.team, b.x, b.y, hitSize + 8, Objects::nonNull);
        if (u != null) {
            Seq<Unit> collided = Seq.with(u);
            if (ownerType != null && collided.size > 0) {
                this.harpoonStuck = true;
                this.harpoonRetracting = false;
                Unit stuckOn = Groups.unit.getByID(collided.peek().id);
                this.relativeRotation = stuckOn.angleTo(b.x, b.y) - stuckOn.rotation;
                this.distanceOffset = b.dst(stuckOn);
            }
        }
    }

    @Override
    public void hit(Bullet b, float x, float y) {
        super.hit(b, x, y);
        resetHarpoon(b);
    }
}
