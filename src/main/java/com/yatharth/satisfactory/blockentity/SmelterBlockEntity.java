// src/main/java/com/yatharth/satisfactory/blockentity/SmelterBlockEntity.java
package com.yatharth.satisfactory.blockentity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import com.yatharth.satisfactory.ModBlockEntities;

public class SmelterBlockEntity extends BlockEntity {

    public SmelterBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(ModBlockEntities.SMELTER_BE.get(), pPos, pBlockState);
    }

    // Add methods for machine logic here (e.g., smelting, item handling)
}
