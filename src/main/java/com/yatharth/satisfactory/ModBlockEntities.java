package com.yatharth.satisfactory;

import com.yatharth.satisfactory.blockentity.AssemblerBlockEntity;
import com.yatharth.satisfactory.blockentity.BiomassBurnerBlockEntity;
import com.yatharth.satisfactory.blockentity.ConstructorBlockEntity;
import com.yatharth.satisfactory.blockentity.SmelterBlockEntity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.RegisterEvent;

public class ModBlockEntities {

    public static final RegistryObject<BlockEntityType<ConstructorBlockEntity>> CONSTRUCTOR_BE =
            registerBlockEntity("constructor", ModBlocks.CONSTRUCTOR.get(), (pos, state) -> new ConstructorBlockEntity(pos, state));
    public static final RegistryObject<BlockEntityType<AssemblerBlockEntity>> ASSEMBLER_BE =
            registerBlockEntity("assembler", ModBlocks.ASSEMBLER.get(), (pos, state) -> new AssemblerBlockEntity(pos, state));
    public static final RegistryObject<BlockEntityType<SmelterBlockEntity>> SMELTER_BE =
            registerBlockEntity("smelter", ModBlocks.SMELTER.get(), (pos, state) -> new SmelterBlockEntity(pos, state));
    public static final RegistryObject<BlockEntityType<BiomassBurnerBlockEntity>> BIOMASS_BURNER_BE =
            registerBlockEntity("biomass_burner", ModBlocks.BIOMASS_BURNER.get(), (pos, state) -> new BiomassBurnerBlockEntity(pos, state));

    private static <T extends BlockEntity> RegistryObject<BlockEntityType<T>> registerBlockEntity(String name, Block block, BlockEntitySupplier<T> supplier) {
        return SatisfactoryMod.BLOCK_ENTITY_TYPES.register(name, () -> BlockEntityType.Builder.of((pos, state) -> supplier.create(pos, state), block).build(null));
    }

    @FunctionalInterface
    interface BlockEntitySupplier<T extends BlockEntity> {
        T create(BlockPos pos, BlockState state);
    }

    public static void register(IEventBus eventBus) {
        SatisfactoryMod.BLOCK_ENTITY_TYPES.register(eventBus);
    }

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlockEntityRegistry(final RegisterEvent blockEntityRegistryEvent) {
            // Register block entities here if needed, but they are already registered using RegistryObject
        }
    }
}
