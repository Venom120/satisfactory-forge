package com.yatharth.satisfactory;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, SatisfactoryMod.MODID);

    public static final RegistryObject<Item> IRON_SHEET = ITEMS.register("iron_sheet",
        () -> new Item(new Item.Properties())
    );
}
