package galaxia.content;

import mindustry.ai.types.BuilderAI;
import mindustry.type.UnitType;

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

        }};
    }
}
