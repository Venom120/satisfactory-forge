package com.yatharth.satisfactory.recipe;

import com.mojang.serialization.MapCodec;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ConstructorRecipeSerializer implements RecipeSerializer<ConstructorRecipe> {
    public static final ConstructorRecipeSerializer INSTANCE = new ConstructorRecipeSerializer();
    public static final MapCodec<ConstructorRecipe> CODEC = RecordCodecBuilder.mapCodec(instance ->
        instance.group(
            ResourceLocation.CODEC.fieldOf("id").forGetter(ConstructorRecipe::getId),
            Ingredient.CODEC.fieldOf("ingredient1").forGetter(ConstructorRecipe::getIngredient1),
            Ingredient.CODEC.fieldOf("ingredient2").forGetter(ConstructorRecipe::getIngredient2),
            ItemStack.CODEC.fieldOf("result").forGetter(ConstructorRecipe::getResult)
        ).apply(instance, ConstructorRecipe::new)
    );
    private ConstructorRecipeSerializer() {
    }

    @Override
    public MapCodec<ConstructorRecipe> codec() {
        return ConstructorRecipe.CODEC;
    }

    @Override
    public StreamCodec<RegistryFriendlyByteBuf, ConstructorRecipe> streamCodec() {
        return ConstructorRecipe.STREAM_CODEC;
    }
}