package com.mortimyrrh.mycelia.item;

import com.mortimyrrh.mycelia.Mycelia;
import com.mortimyrrh.mycelia.item.custom.MycelialStewItem;
import com.mortimyrrh.mycelia.item.custom.NautilusItem;
import net.minecraft.world.item.Item;
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

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
