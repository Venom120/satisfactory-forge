package com.yatharth.satisfactory.recipe;

import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.crafting.RecipeInput;

public class ConstructorContainer extends SimpleContainer implements RecipeInput {
    public ConstructorContainer(int size) {
        super(size);
    }

    @Override
    public int size() {
        return super.getContainerSize();
    }
}
