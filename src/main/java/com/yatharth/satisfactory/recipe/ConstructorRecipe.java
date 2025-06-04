package com.yatharth.satisfactory.recipe;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.RegistryFriendlyByteBuf;

import javax.annotation.Nonnull;

public class ConstructorRecipe implements Recipe<ConstructorContainer> {

    private final ResourceLocation id;
    private final ItemStack result;
    private final Ingredient ingredient1;
    private final Ingredient ingredient2;

    public ConstructorRecipe(ResourceLocation id, Ingredient ingredient1, Ingredient ingredient2, ItemStack result) {
        this.id = id;
        this.ingredient1 = ingredient1;
        this.ingredient2 = ingredient2;
        this.result = result;
    }

    // Required CODEC
    public static final MapCodec<ConstructorRecipe> CODEC = RecordCodecBuilder.mapCodec(instance -> instance.group(
        ResourceLocation.CODEC.fieldOf("id").forGetter(ConstructorRecipe::getId),
        Ingredient.CODEC.fieldOf("ingredient1").forGetter(ConstructorRecipe::getIngredient1),
        Ingredient.CODEC.fieldOf("ingredient2").forGetter(ConstructorRecipe::getIngredient2),
        ItemStack.CODEC.fieldOf("result").forGetter(ConstructorRecipe::getResult)
    ).apply(instance, ConstructorRecipe::new));
    
    // Required StreamCodec
    public static final StreamCodec<RegistryFriendlyByteBuf, ConstructorRecipe> STREAM_CODEC = StreamCodec.composite(
        ResourceLocation.STREAM_CODEC, ConstructorRecipe::getId,
        Ingredient.CONTENTS_STREAM_CODEC, ConstructorRecipe::getIngredient1,
        Ingredient.CONTENTS_STREAM_CODEC, ConstructorRecipe::getIngredient2,
        ItemStack.STREAM_CODEC, ConstructorRecipe::getResult,
        ConstructorRecipe::new
    );


    @Override
    public boolean matches(@Nonnull ConstructorContainer container, @Nonnull Level level) {
        return ingredient1.test(container.getItem(0)) && ingredient2.test(container.getItem(1));
    }

    @Override
    public ItemStack assemble(@Nonnull ConstructorContainer container, @Nonnull HolderLookup.Provider provider) {
        return result.copy();
    }

    @Override
    public boolean canCraftInDimensions(int width, int height) {
        return true;
    }

    @Override
    public ItemStack getResultItem(@Nonnull HolderLookup.Provider provider) {
        return result.copy();
    }

    public ResourceLocation getId() {
        return id;
    }
@Override
    public RecipeSerializer<?> getSerializer() {
        return ConstructorRecipeSerializer.INSTANCE;
    }

    @Override
    public RecipeType<?> getType() {
        return com.yatharth.satisfactory.ModRecipeTypes.CONSTRUCTOR_RECIPE_TYPE.get();
    }

    public ItemStack getResult() {
        return result;
    }

    public Ingredient getIngredient1() {
        return ingredient1;
    }

    public Ingredient getIngredient2() {
        return ingredient2;
    }
}
