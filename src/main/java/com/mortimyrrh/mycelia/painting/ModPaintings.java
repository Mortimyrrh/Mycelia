package com.mortimyrrh.mycelia.painting;

import com.mortimyrrh.mycelia.Mycelia;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPaintings {
    public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS =
        DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, Mycelia.MOD_ID);

    public static final RegistryObject<PaintingVariant> DISTANT = PAINTING_VARIANTS.register("distant",
            () -> new PaintingVariant(16, 32));

    public static final RegistryObject<PaintingVariant> CLOSE = PAINTING_VARIANTS.register("close",
            () -> new PaintingVariant(16, 16));

    public static final RegistryObject<PaintingVariant> heather = PAINTING_VARIANTS.register("heather",
            () -> new PaintingVariant(32, 16));

    public static void register(IEventBus eventBus)
    {
        PAINTING_VARIANTS.register(eventBus);
    }

}
