// src/main/java/com/yatharth/satisfactory/blockentity/AssemblerBlockEntity.java
package com.yatharth.satisfactory.blockentity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import com.yatharth.satisfactory.ModBlockEntities;

public class AssemblerBlockEntity extends BlockEntity {

    public AssemblerBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(ModBlockEntities.ASSEMBLER_BE.get(), pPos, pBlockState);
    }

    // Add methods for machine logic here (e.g., crafting, item handling)
}
