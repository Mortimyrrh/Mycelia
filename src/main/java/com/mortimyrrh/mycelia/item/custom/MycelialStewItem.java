package com.mortimyrrh.mycelia.item.custom;

import com.mortimyrrh.mycelia.item.ModCreativeModeTab;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;

public class MycelialStewItem extends Item {
    public MycelialStewItem()
    {
        super(new Item.Properties()
                .rarity(Rarity.RARE)
                .tab(ModCreativeModeTab.MYCELIA_TAB)
                .stacksTo(8)
                .food(new FoodProperties.Builder()
                        .fast()
                        .alwaysEat()
                        .nutrition(6)
                        .saturationMod(7)
                        .build()
                )
        );
    }
//    appendHoverText
//
//    @OnlyIn(Dist.CLIENT)
//    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
//        tooltip.add(new TranslationTextComponent("item.mycelia.mycelial_stew.tooltip")
//                .setStyle(Style.EMPTY
//                        .applyFormat(TextFormatting.DARK_PURPLE)
//                        .applyFormat(TextFormatting.ITALIC)));
//    }
}
