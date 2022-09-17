package net.craftycatdevs.ccdpaleomod.item;

import net.craftycatdevs.ccdpaleomod.CCDPaleoMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CCDPaleoMod.MOD_ID);

    public static final RegistryObject<Item> AMBER = ITEMS.register("amber",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PALEOMOD_ITEMS)));
    public static final RegistryObject<Item> AMBER_MOSQUITO = ITEMS.register("amber_mosquito",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PALEOMOD_ITEMS)));

    public static final RegistryObject<Item> AMBER_APHID = ITEMS.register("amber_aphid",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PALEOMOD_ITEMS)));

    public static final RegistryObject<Item> PLANT_FOSSIL = ITEMS.register("plant_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PALEOMOD_ITEMS)));

    public static final RegistryObject<Item> GYPSUM_POWDER = ITEMS.register("gypsum_powder",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PALEOMOD_ITEMS)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}
