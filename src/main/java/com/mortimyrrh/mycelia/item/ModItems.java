package com.mortimyrrh.mycelia.item;

import com.mortimyrrh.mycelia.Mycelia;
import com.mortimyrrh.mycelia.item.custom.MycelialStewItem;
import com.mortimyrrh.mycelia.item.custom.NautilusItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Mycelia.MOD_ID);

    public static final RegistryObject<Item> MYCELIAL_STEW = ITEMS.register("mycelial_stew",
            () -> new MycelialStewItem());

    public static final RegistryObject<Item> NAUTILUS = ITEMS.register("nautilus",
            () -> new NautilusItem());

    public static final RegistryObject<Item> FIERCE_DEITY_SWORD = ITEMS.register("fierce_deity_sword",
            () -> new SwordItem(Tiers.DIAMOND, 10, 5f,
                    new Item.Properties()
                            .rarity(Rarity.RARE)
                            .tab(ModCreativeModeTab.MYCELIA_TAB)
                            .stacksTo(1)
                    ));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
