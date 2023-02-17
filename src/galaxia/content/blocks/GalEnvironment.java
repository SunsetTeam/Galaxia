package galaxia.content.blocks;

import mindustry.world.Block;
import mindustry.world.blocks.environment.Floor;
import mindustry.world.blocks.environment.StaticWall;

public class GalEnvironment {

    public static Block

    //green-biom
    grenbyFloor, grenbyWall,

    //red-biom
    crimoStone, crimoStoneWall,

    crypoStone, crypoStoneWall,

    inferoStone, inferoStoneWall;


    public static void load() {

        grenbyFloor = new Floor("grenby-floor"){{
           variants = 3;
        }};

        crimoStone = new Floor("crimoStone"){{
            variants = 4;
        }};

        crypoStone = new Floor("crypoStone"){{
            variants = 4;
        }};

        inferoStone = new Floor("inferoStone"){{
            variants = 3;
        }};

        grenbyWall = new StaticWall("grenby-wall"){{
            variants = 2;
        }};

        crimoStoneWall = new StaticWall("crimoStone-wall"){{
            variants = 3;
        }};

        crypoStoneWall = new StaticWall("crypoStone-wall"){{
            variants = 3;
        }};

        inferoStoneWall = new StaticWall("inferoStone-wall"){{
            variants = 2;
        }};
    }
}
