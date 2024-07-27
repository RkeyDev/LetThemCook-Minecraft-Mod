package com.rkey.let_them_cook.items;

import com.rkey.let_them_cook.LetThemCook;
import com.rkey.let_them_cook.items.custom_items.LTCbananaItem;
import com.rkey.let_them_cook.items.custom_items.LTCfoodItem;
import net.minecraft.world.item.BannerItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class LTCitems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LetThemCook.MOD_ID);

    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato",
            () -> new Item(new Item.Properties().food(LTCfoodItem.createBasicFood(2)))
    );

    public static final RegistryObject<Item> CUCUMBER = ITEMS.register("cucumber",
            () -> new Item(new Item.Properties().food(LTCfoodItem.createBasicFood(2)))
    );


    public static final RegistryObject<Item> BANANA = ITEMS.register("banana",
            () -> new LTCbananaItem(new Item.Properties())
    );

    public static final RegistryObject<Item> PEELED_BANANA_1 = ITEMS.register("peeled_banana_1",
            () -> new LTCbananaItem(new Item.Properties())
    );

    public static final RegistryObject<Item> PEELED_BANANA_2 = ITEMS.register("peeled_banana_2",
            () -> new LTCbananaItem(new Item.Properties())
    );

    public static final RegistryObject<Item> PEELED_BANANA = ITEMS.register("peeled_banana",
            () -> new Item(new Item.Properties().food(LTCfoodItem.createBasicFood(3)))
    );



    public static final RegistryObject<Item> GARLIC_BULB = ITEMS.register("garlic_bulb",
            () -> new Item(new Item.Properties())
    );

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
