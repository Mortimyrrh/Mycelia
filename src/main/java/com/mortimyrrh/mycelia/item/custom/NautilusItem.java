package com.mortimyrrh.mycelia.item.custom;

import com.mortimyrrh.mycelia.item.ModCreativeModeTab;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;
public class NautilusItem extends Item {
    public NautilusItem()
    {
        super(new Item.Properties()
                .rarity(Rarity.COMMON)
                .tab(ModCreativeModeTab.MYCELIA_TAB)
        );
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag tooltipFlag) {
        if(Screen.hasShiftDown())
        {
            components.add(Component.literal("Use to teleport between stuff...")
                    .withStyle(ChatFormatting.DARK_AQUA)
                    .withStyle(ChatFormatting.ITALIC)
            );
        } else {
            components.add(Component.literal("Press SHIFT for more info").withStyle(ChatFormatting.YELLOW));
        }

        super.appendHoverText(itemStack, level, components, tooltipFlag);
    }
}