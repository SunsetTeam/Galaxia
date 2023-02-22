package galaxia.content;

import galaxia.entities.bullet.HarpoonBulletType;
import mindustry.ai.types.BuilderAI;
import mindustry.content.Fx;
import mindustry.gen.Sounds;
import mindustry.gen.UnitEntity;
import mindustry.type.UnitType;
import mindustry.type.Weapon;

public class GalUnits {
    public static UnitType
            gyurza;

    public static void load() {
        //core
        gyurza = new UnitType("gyurza") {{
            aiController = BuilderAI::new;
            isEnemy = false;

            flying = true;
            mineSpeed = 15f;
            mineTier = 1;
            buildSpeed = 4.4f;
            drag = 0.05f;
            speed = 3.3f;
            rotateSpeed = 17f;
            accel = 0.1f;
            itemCapacity = 50;
            health = 170f;
            engineOffset = 6f;
            hitSize = 9f;
            faceTarget = false;
            lowAltitude = true;

            constructor = UnitEntity::create;
            weapons.add(new Weapon("harpoon"){{
                bullet = new HarpoonBulletType(4.2f, 37f);
                reload = 80f;
                alternate = false;
                x = 0f;
                y = 0f;
                rotate = true;
                ejectEffect = Fx.none;
                shootSound = Sounds.shootSnap;
            }});
        }};
    }
}
