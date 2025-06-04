// src/main/java/com/yatharth/satisfactory/blockentity/BiomassBurnerBlockEntity.java
package com.yatharth.satisfactory.blockentity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import com.yatharth.satisfactory.ModBlockEntities;

public class BiomassBurnerBlockEntity extends BlockEntity {

    public BiomassBurnerBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(ModBlockEntities.BIOMASS_BURNER_BE.get(), pPos, pBlockState);
    }

    // Add methods for machine logic here (e.g., burning fuel, generating power, item handling)
}
