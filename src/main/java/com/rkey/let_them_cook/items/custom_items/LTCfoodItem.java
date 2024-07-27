package com.rkey.let_them_cook.items.custom_items;

import net.minecraft.world.food.FoodProperties;

public class LTCfoodItem {





    public static FoodProperties createBasicFood(int nutrition){
        return new FoodProperties.Builder().nutrition(nutrition).build();
    }
}
