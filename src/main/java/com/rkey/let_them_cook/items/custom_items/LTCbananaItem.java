package com.rkey.let_them_cook.items.custom_items;

import com.rkey.let_them_cook.items.LTCitems;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.RegistryObject;

public class LTCbananaItem extends Item {
    public LTCbananaItem(Properties p_41383_) {
        super(p_41383_);
    }

    RegistryObject<Item>[] bananas = new RegistryObject[]{
            LTCitems.BANANA,
            LTCitems.PEELED_BANANA_1,
            LTCitems.PEELED_BANANA_2,
            LTCitems.PEELED_BANANA,

    };

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        if(!world.isClientSide()){
            for(int i = 0; i<bananas.length;i++){
                if (bananas[i].get().asItem() == player.getMainHandItem().getItem().asItem()) {
                    player.setItemInHand(hand, new ItemStack(bananas[i + 1].get().asItem()));
                    return super.use(world,player,hand);
                }
            }

        }
        return InteractionResultHolder.fail(player.getItemInHand(hand));
    }
}
