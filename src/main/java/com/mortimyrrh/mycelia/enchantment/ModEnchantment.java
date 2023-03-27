package com.mortimyrrh.mycelia.enchantment;

import com.mortimyrrh.mycelia.Mycelia;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEnchantment {
    public static final DeferredRegister<Enchantment> ENCANTMENTS =
            DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, Mycelia.MOD_ID);

    public static RegistryObject<Enchantment> COPPER_PLATED =
            ENCANTMENTS.register("copper_plated",
                    () -> new CopperPlatedEnchantment(Enchantment.Rarity.RARE,
                            EnchantmentCategory.WEARABLE,
                            EquipmentSlot.CHEST,
                            EquipmentSlot.HEAD,
                            EquipmentSlot.FEET,
                            EquipmentSlot.LEGS));
    public static void register(IEventBus eventBus){
        ENCANTMENTS.register(eventBus);
    }
}
