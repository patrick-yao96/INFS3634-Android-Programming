package com.example.borgerkong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class BorgerKongDatabase {

    //retrieves itemID
    public static Item getItemByID(int itemID)
    {
        return items.get(itemID);
    }
    //returns an ArrayList with all items
    public static ArrayList<Item> getAllItems()
    {
        return new ArrayList<Item>((List)Arrays.asList(items.values().toArray()));
    }



    // all menu items and attributes
    private static final HashMap<Integer, Item> items = new HashMap<>();

    static
    {
        items.put(1,new Item(
                        1,
                        "BK Blue Burger",
                        14,
                        "Maytag blue cheese + arugula",
                R.drawable.blue_burger,
                0

                ));
        items.put(2,new Item(
                2,
                "BK American Burger",
                15,
                "American cheese + butter lettuce + tomato + pickle + onion",
                R.drawable.american_burger,
                0

        ));
        items.put(3,new Item(
                3,
                "BK Chanterelle Burger",
                16,
                "Chanterelle mushrooms + arugula + figgy-onion jam",
                R.drawable.chanterelle_burger,
                0

        ));
        items.put(4,new Item(
                4,
                "BK FarmHouse Burger",
                15,
                "Duck breast bacon + english sharp cheddar + fried egg",
                R.drawable.farmhouse_burger,
                0
        ));
        items.put(5,new Item(
                5,
                "BK Hog Burger",
                18,
                "Mangalitsa pork + mangalitsa bacon + bbq pork + vintage white cheddar + pickles + crisp onion + slaw",
                R.drawable.hog_burger,
                0
        ));
        items.put(6,new Item(
                6,
                "BK Fury Chicken Wings",
                14,
                "Tangy hellfire blue cheese wings",
                R.drawable.fury_chicken_wings,
                0
        ));
        items.put(7,new Item(
                7,
                "BK Potato Fries",
                9,
                "Vanilla powdered sugar + honey jalapeño mayo",
                R.drawable.potato_fries,
                0
        ));
        items.put(8,new Item(
                8,
                "BK Gooey Fries",
                13,
                "Hand cut fries + vintage white cheddar + smoked gouda cheese + toscano salami + over easy egg",
                R.drawable.gooey_fries,
                0
        ));
        items.put(9,new Item(
                9,
                "BK Battered Maui Onion Rings",
                9,
                "Parmigiano-reggiano + chipotle ketchup\n" +
                        "+ cheddar ranch dip",
                R.drawable.onion_rings,
                0
        ));
        items.put(10,new Item(
                10,
                "BK Kale Granny-Apple Caesar Salad",
                13,
                "Parmigiano-reggiano cheese\n" +
                        " + mini herb-garlic croutons",
                R.drawable.caesar_salad,
                0
        ));
        items.put(11,new Item(
                11,
                "Coke",
                3,
                "Coco-Cola 250ml",
                R.drawable.coke,
                0
        ));
        items.put(12,new Item(
                12,
                "Sprite",
                3,
                "Sprite 250ml",
                R.drawable.sprite,
                0
        ));
        items.put(13,new Item(
                13,
                "Bottled Water",
                2,
                "Bottled Water 300ml",
                R.drawable.bottled_water,
                0
        ));
        items.put(14,new Item(
                14,
                "BK Vanilla Shake",
                6,
                "Vanilla ice-cream + whipped cream + condensed milk",
                R.drawable.vanilla_shake,
                0
        ));
        items.put(15,new Item(
                15,
                "BK Chocolate Shake",
                7,
                "Triple chocolate ice-cream + chocolate fudge + whipped cream",
                R.drawable.chocolate_shake,
                0

        ));



    }

}
