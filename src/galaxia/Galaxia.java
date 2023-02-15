package galaxia;

import arc.Core;
import arc.Events;
import arc.util.Log;
import arc.util.Time;
import mindustry.game.EventType;
import mindustry.mod.*;
import galaxia.content.*;
import mindustry.ui.dialogs.BaseDialog;

public class Galaxia extends Mod{

    public Galaxia(){
        Log.info("Loaded ExampleJavaMod constructor.");
        Events.on(EventType.ClientLoadEvent.class, e -> {
            Time.runTask(10f, () -> {

                BaseDialog dialog = new BaseDialog("Attention!");
                dialog.cont.add("The mod is under development and there you can see unfinished content/bugs!").row();

                dialog.cont.image(Core.atlas.find("galaxia-fors")).pad(20f).row();
                dialog.cont.button("Okay", dialog::hide).size(100f, 50f);
                dialog.show();
            });
        });
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
