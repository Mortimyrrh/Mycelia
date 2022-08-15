package com.mortimyrrh.mycelia.item.custom;

import com.mortimyrrh.mycelia.item.ModCreativeModeTab;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MycelialStewItem extends Item {
    public MycelialStewItem()
    {
        super(new Item.Properties()
                .rarity(Rarity.COMMON)
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

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag tooltipFlag) {
        if(Screen.hasShiftDown())
        {
            components.add(Component.literal("When eaten will teleport you into the Mycelial Network")
                    .withStyle(ChatFormatting.DARK_AQUA)
                    .withStyle(ChatFormatting.ITALIC)
            );
        } else {
            components.add(Component.literal("Press SHIFT for more info").withStyle(ChatFormatting.YELLOW));
        }
        // advancement "A yummy treat with a multi-dimensional kick"
        // tags
        // recipe
        // loot tabels?
        // make the myshroom placeabale

        super.appendHoverText(itemStack, level, components, tooltipFlag);
    }
}
