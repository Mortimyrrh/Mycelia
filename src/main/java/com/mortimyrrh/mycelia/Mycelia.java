package com.mortimyrrh.mycelia;

import com.mojang.logging.LogUtils;
import com.mortimyrrh.mycelia.block.ModBlocks;
import com.mortimyrrh.mycelia.enchantment.ModEnchantment;
import com.mortimyrrh.mycelia.item.ModItems;
import com.mortimyrrh.mycelia.painting.ModPaintings;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Mycelia.MOD_ID)
public class Mycelia
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "mycelia";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Mycelia()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModPaintings.register(modEventBus);
        ModEnchantment.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MYSHROOM_BLOCK.get(), RenderType.cutout());
        }
    }
}
