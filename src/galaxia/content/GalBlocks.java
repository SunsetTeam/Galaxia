package galaxia.content;
import galaxia.world.blocks.power.LightningPowerNode;
import mindustry.type.Category;
import mindustry.world.Block;

public class GalBlocks {
    public static Block
    plasmaNode, plasmaDistributor;

    public static void load() {

        plasmaNode = new LightningPowerNode("plasma-node", 0){{
            category = Category.power;
            consumePowerBuffered(4000f);
            lightningRange = 16 * 8f;
            thresholdPerTile = 25f / 8;
        }};

        plasmaDistributor = new LightningPowerNode("plasma-distributor", 12){{
            category = Category.power;
            size = 2;
            consumePowerBuffered(7500f);
            lightningRange = 9 * 8f;
            laserRange = 7;
            thresholdPerTile = 10f / 8;
        }};
    }
}
