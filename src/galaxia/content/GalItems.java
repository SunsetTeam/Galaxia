package galaxia.content;

import mindustry.type.Item;

public class GalItems {
    public static Item kalyenite, lonite, olynite, thirium, fors;

    //TODO item costs
    public static void load() {
        kalyenite = new Item("kalyenite");
        lonite = new Item("lonite");
        olynite = new Item("olynite");
        thirium = new Item("thirium");
        fors = new Item("fors");
    }
}
