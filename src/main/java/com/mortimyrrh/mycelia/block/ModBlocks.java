package com.mortimyrrh.mycelia.block;

import com.mortimyrrh.mycelia.Mycelia;
import com.mortimyrrh.mycelia.block.custom.MycelialLodestoneBlock;
import com.mortimyrrh.mycelia.block.custom.MyshroomBlock;
import com.mortimyrrh.mycelia.item.ModCreativeModeTab;
import com.mortimyrrh.mycelia.item.ModItems;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Mycelia.MOD_ID);

    public static final RegistryObject<Block> BLAH_BLOCK = registerBlock("blah",
            () -> new Block(BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.MYCELIA_TAB);

    public static final RegistryObject<Block> MYSHROOM = registerBlock("myshroom",
            () -> new MyshroomBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM)), ModCreativeModeTab.MYCELIA_TAB);

    public static final RegistryObject<Block> MYCELIAL_LODESTONE = registerBlock("mycelial_lodestone",
            () -> new MycelialLodestoneBlock(), ModCreativeModeTab.MYCELIA_TAB);


    private static <T extends Block> RegistryObject<T> registerBlock(String name,
                                                                     Supplier<T> block,
                                                                     CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name,
                                                                            RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
