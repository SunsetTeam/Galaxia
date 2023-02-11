package galaxia.content;

import mindustry.type.Item;

public class GalItems {
    public static Item craside, kaylenite, hanshinium, lonite, olynite, thirium, fors;

    //TODO item costs
    public static void load() {

        craside = new Item("craside");
        kaylenite = new Item("kalyenite");
        hanshinium = new Item("hanshinium");

        lonite = new Item("lonite");
        olynite = new Item("olynite");
        thirium = new Item("thirium");
        fors = new Item("fors");
    }
}
