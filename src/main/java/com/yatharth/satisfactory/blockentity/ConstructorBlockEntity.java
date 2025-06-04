// src/main/java/com/yatharth/satisfactory/blockentity/ConstructorBlockEntity.java
package com.yatharth.satisfactory.blockentity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import com.yatharth.satisfactory.ModBlockEntities;

public class ConstructorBlockEntity extends BlockEntity {

    public ConstructorBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(ModBlockEntities.CONSTRUCTOR_BE.get(), pPos, pBlockState);
    }

    // Add methods for machine logic here (e.g., crafting, item handling)
}
