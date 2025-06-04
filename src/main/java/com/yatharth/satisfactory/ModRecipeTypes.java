package com.yatharth.satisfactory;

import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import com.yatharth.satisfactory.recipe.ConstructorRecipeType;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModRecipeTypes {

    public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES =
            DeferredRegister.create(ForgeRegistries.RECIPE_TYPES, SatisfactoryMod.MODID);

    public static final RegistryObject<RecipeType<?>> CONSTRUCTOR_RECIPE_TYPE =
            RECIPE_TYPES.register("constructor", ConstructorRecipeType::new);

    public static void register(IEventBus eventBus) {
        RECIPE_TYPES.register(eventBus);
    }

    @SubscribeEvent
    public static void onCommonSetup(final FMLCommonSetupEvent event) {
    }
}
