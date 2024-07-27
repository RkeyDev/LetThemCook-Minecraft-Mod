package com.rkey.let_them_cook.util;

import com.rkey.let_them_cook.LetThemCook;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;


public class LTCtags {

    public static class Blocks{


        public static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(LetThemCook.MOD_ID,name));
        }
    }

    public static class Items{
        public static final TagKey<Item> VEGETABLE = tag("vegetable");
        public static final TagKey<Item> FRUIT = tag("fruit");
        public static TagKey<Item> tag(String name){
            return ItemTags.create(new ResourceLocation(LetThemCook.MOD_ID,name));
        }
    }


}
