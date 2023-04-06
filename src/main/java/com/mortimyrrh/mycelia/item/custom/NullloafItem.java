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
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class NullloafItem extends Item {
    public NullloafItem()
    {
        super(new Properties()
                .rarity(Rarity.UNCOMMON)
                .tab(ModCreativeModeTab.MYCELIA_TAB)
                .stacksTo(1)
                .food(new FoodProperties.Builder()
                        .nutrition(4)
                        .saturationMod(3)
                        .build()
                )
        );
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag tooltipFlag) {
        if(Screen.hasShiftDown())
        {
            components.add(Component.literal("A sweet brioche with a pink and black glaze. \n Remove's current effects.")
                    .withStyle(ChatFormatting.DARK_AQUA)
                    .withStyle(ChatFormatting.ITALIC)
            );
        } else {
            components.add(Component.literal("Press SHIFT for more info").withStyle(ChatFormatting.YELLOW));
        }

        super.appendHoverText(itemStack, level, components, tooltipFlag);
    }
}
