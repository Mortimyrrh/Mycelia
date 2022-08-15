package com.mortimyrrh.mycelia.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MYCELIA_TAB = new CreativeModeTab("myceliatab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MYSHROOM.get());
        }
    };
}
