package galaxia.content;

import mindustry.ai.types.BuilderAI;
import mindustry.type.UnitType;

public class GalUnits {
    public static UnitType none;
    public static void load() {
        //core
        UnitType gyurza = new UnitType("Gyurza") {{
            aiController = BuilderAI::new;
            isEnemy = false;

            lowAltitude = true;
            flying = true;
            mineSpeed = 21.5f;
            mineTier = 1;
            buildSpeed = 0.35f;
            drag = 0.05f;
            speed = 4.3f;
            rotateSpeed = 10f;
            accel = 0.1f;
            itemCapacity = 20;
            health = 340f;
            hitSize = 12f;
            alwaysUnlocked = true;

        }};
    }
}
