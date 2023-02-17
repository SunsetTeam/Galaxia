package galaxia.content;
import galaxia.content.blocks.*;

public class GalBlocks implements Runnable{
    public Runnable[] list = {
            GalCrafting::load,

            GalDistribution::load,
            GalLiquidBlocks::load,

            GalPower::load,
            GalProduction::load,

            GalUnitBlocks::load,
            GalPayloadBlocks::load,

            GalSandbox::load,

            GalEnvironment::load,
    };

    public static void load(){
        throw new RuntimeException("is must not invoked");
//        for (ContentList blockList : list) {
//            blockList.load();
//        }
    }

    @Override
    public void run(){
        load();
    }
}
