package galaxia.content;

import arc.graphics.Color;
import mindustry.type.Item;

public class GalItems {
    public static Item
            //1
            fors, thirium,
    //2
    craside, kaylenite, hanshinium, khalgon,
    //3
    lonite, olynite;

    //TODO item costs
    public static void load() {

        //1
        fors = new Item("fors", Color.valueOf("f3b2c9")){{
            hardness = 1;
            cost = 1f;
        }};
        thirium = new Item("thirium", Color.valueOf("d6e6c6")){{
            hardness = 1;
            cost = 1;
        }};

        //2
        craside = new Item("craside", Color.valueOf("aee4cc")){{
            cost = 2f;
        }};
        kaylenite = new Item("kaylenite", Color.valueOf("522a3a"/*f6927e*/)){{
            cost = 2f;
        }};
        hanshinium = new Item("hanshinium", Color.valueOf("c5d776")){{
            cost = 1f; //or it'd better to make 2?
        }};
        khalgon = new Item("khalgon", Color.valueOf("e2a1f2")){{
            cost = 3f;
            hardness = 3;
        }};

        //3
        lonite = new Item("lonite"){{
            cost = 1f;
        }};
        olynite = new Item("olynite"){{
            cost = 1f;
        }};
    }
}
