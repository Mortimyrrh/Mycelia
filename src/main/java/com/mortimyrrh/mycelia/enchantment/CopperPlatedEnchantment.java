package com.mortimyrrh.mycelia.enchantment;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

import java.util.Map;

public class CopperPlatedEnchantment extends Enchantment {
    public CopperPlatedEnchantment(Rarity pRarity, EnchantmentCategory pCategory, EquipmentSlot... pSlots) {
        super(pRarity, pCategory, pSlots);
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }
}
