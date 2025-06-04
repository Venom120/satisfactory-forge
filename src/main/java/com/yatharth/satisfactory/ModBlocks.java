package com.yatharth.satisfactory;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;

public class ModBlocks {
    public static final RegistryObject<Block> CONSTRUCTOR = registerBlock("constructor", new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final RegistryObject<Block> ASSEMBLER = registerBlock("assembler", new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final RegistryObject<Block> SMELTER = registerBlock("smelter", new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final RegistryObject<Block> BIOMASS_BURNER = registerBlock("biomass_burner", new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

    private static RegistryObject<Block> registerBlock(String name, Block block) {
        RegistryObject<Block> toReturn = SatisfactoryMod.BLOCKS.register(name, () -> block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return SatisfactoryMod.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        SatisfactoryMod.BLOCKS.register(eventBus);
    }
}
