package com.rkey.let_them_cook;

import com.rkey.let_them_cook.LetThemCook;
import com.rkey.let_them_cook.items.LTCitems;
import com.rkey.let_them_cook.util.LTCtags;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class LTCcreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LetThemCook.MOD_ID);


    public static final RegistryObject<CreativeModeTab> VEGETABLES =
            CREATIVE_MODE_TABS.register("vegetables_tab",
                    () -> CreativeModeTab.builder()
                            .icon(() -> new ItemStack(LTCitems.TOMATO.get()))
                            .title(Component.translatable("creative_tab.vegetables_tab"))
                            .displayItems(((pParameters, pOutput) -> {

                                //Sign items to the creative tab
                                LTCitems.ITEMS.getEntries().forEach(
                                        item -> {
                                            if(item.get().builtInRegistryHolder().is(LTCtags.Items.VEGETABLE))
                                                pOutput.accept(item.get());
                                        }


                                        );

                            }))
                            .build()
            );




    public static final RegistryObject<CreativeModeTab> FRUITS =
            CREATIVE_MODE_TABS.register("fruits_tab",
                    () -> CreativeModeTab.builder()
                            .icon(() -> new ItemStack(LTCitems.BANANA.get()))
                            .title(Component.translatable("creative_tab.fruits_tab"))
                            .displayItems(((pParameters, pOutput) -> {

                                //Sign items to the creative tab
                                LTCitems.ITEMS.getEntries().forEach(
                                        item -> {
                                            if(item.get().builtInRegistryHolder().is(LTCtags.Items.FRUIT))
                                                pOutput.accept(item.get());
                                        }


                                );

                            }))
                            .build()
            );




    public static void register(IEventBus eventBus){

        CREATIVE_MODE_TABS.register(eventBus);
    }
}
