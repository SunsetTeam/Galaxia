package galaxia.content.blocks;

import mindustry.world.Block;
import mindustry.world.blocks.environment.Floor;
import mindustry.world.blocks.environment.StaticWall;

public class GalEnvironment {

    public static Block

    //green-biome
    ylbStone, ylbStoneWall,

    //red-biome
    crimStone, crimStoneWall,
    infStone, infStoneWall,

    //purple-biome
    prbStone, prbStoneWall;


    public static void load() {

        ylbStone = new Floor("ylbstone"){{
           variants = 3;
        }};

        crimStone = new Floor("crimstone"){{
            variants = 4;
        }};

        infStone = new Floor("infstone"){{
            variants = 4;
        }};

        prbStone = new Floor("prbstone"){{
            variants = 3;
        }};

        ylbStoneWall = new StaticWall("ylbstone-wall"){{
            variants = 2;
        }};

        crimStoneWall = new StaticWall("crimStone-wall"){{
            variants = 3;
        }};

        infStoneWall = new StaticWall("infstone-wall"){{
            variants = 3;
        }};

        prbStoneWall = new StaticWall("prbstone-wall"){{
            variants = 2;
        }};
    }
}
