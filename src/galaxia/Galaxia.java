package galaxia;

import mindustry.mod.*;
import galaxia.content.*;

public class Galaxia extends Mod{

    public Galaxia(){
    }

    @Override
    public void loadContent(){
        GalItems.load();
        GalLiquids.load();
        GalStatusEffects.load();
        GalBlocks.load();
        GalUnits.load();
        GalPlanets.load();
    }
}
