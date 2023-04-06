package com.mortimyrrh.mycelia.item.custom;

import com.mortimyrrh.mycelia.Mycelia;
import com.mortimyrrh.mycelia.block.ModBlocks;
import com.mortimyrrh.mycelia.item.ModCreativeModeTab;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MyshroomItem extends ItemNameBlockItem {
    public MyshroomItem()
    {
        super(ModBlocks.MYSHROOM_BLOCK.get(),
                new Properties()
                .rarity(Rarity.UNCOMMON)
                .tab(ModCreativeModeTab.MYCELIA_TAB)
                .stacksTo(64)
        );
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag tooltipFlag) {
        if(Screen.hasShiftDown())
        {
            components.add(Component.literal("Looks usefull...")
                    .withStyle(ChatFormatting.DARK_AQUA)
                    .withStyle(ChatFormatting.ITALIC)
            );
        } else {
            components.add(Component.literal("Press SHIFT for more info").withStyle(ChatFormatting.YELLOW));
        }

        super.appendHoverText(itemStack, level, components, tooltipFlag);
    }
}
