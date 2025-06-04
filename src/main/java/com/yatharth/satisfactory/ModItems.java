package com.yatharth.satisfactory;

import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SatisfactoryMod.MODID);

    // Items will be registered here later, for now, we'll leave it empty
    // public static final RegistryObject<Item> EXAMPLE_ITEM = registerItem("example_item", new Item(new Item.Properties().tab(ModCreativeModeTab.SATISFACTORY_TAB)));

    public static final RegistryObject<Item> IRON_SHEET = ITEMS.register("iron_sheet", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
