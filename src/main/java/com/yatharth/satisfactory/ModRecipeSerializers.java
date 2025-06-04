package com.yatharth.satisfactory;

import com.yatharth.satisfactory.recipe.ConstructorRecipeSerializer;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipeSerializers {

    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, SatisfactoryMod.MODID);

    public static final RegistryObject<RecipeSerializer<?>> CONSTRUCTOR_SERIALIZER =
            RECIPE_SERIALIZERS.register("constructor", () -> ConstructorRecipeSerializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        RECIPE_SERIALIZERS.register(eventBus);
    }
}