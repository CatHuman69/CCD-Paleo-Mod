package net.craftycatdevs.ccdpaleomod.block;

import net.craftycatdevs.ccdpaleomod.CCDPaleoMod;
import net.craftycatdevs.ccdpaleomod.item.ModCreativeModeTab;
import net.craftycatdevs.ccdpaleomod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CCDPaleoMod.MOD_ID);

    public static final RegistryObject<Block> AMBER_BLOCK = registerBlock("amber_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.METAL).color(MaterialColor.COLOR_ORANGE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.PALEOMOD_BLOCKS);

    public static final RegistryObject<Block> AMBER_ORE = registerBlock("amber_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), ModCreativeModeTab.PALEOMOD_BLOCKS);

    public static final RegistryObject<Block> DEEPSLATE_AMBER_ORE = registerBlock("deepslate_amber_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.DEEPSLATE)
                    .strength(7.5f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), ModCreativeModeTab.PALEOMOD_BLOCKS);

    public static final RegistryObject<Block> STONE_PLANT_FOSSIL_ORE = registerBlock("stone_plant_fossil_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.PALEOMOD_BLOCKS);

    public static final RegistryObject<Block> SHALE_PLANT_FOSSIL_ORE = registerBlock("shale_plant_fossil_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.PALEOMOD_BLOCKS);

    public static final RegistryObject<Block> SILTSTONE_PLANT_FOSSIL_ORE = registerBlock("siltstone_plant_fossil_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.TUFF)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.PALEOMOD_BLOCKS);

    public static final RegistryObject<Block> LIMESTONE_PLANT_FOSSIL_ORE = registerBlock("limestone_plant_fossil_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.DRIPSTONE_BLOCK)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.PALEOMOD_BLOCKS);

    public static final RegistryObject<Block> TERRACOTTA_PLANT_FOSSIL_ORE = registerBlock("terracotta_plant_fossil_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.25F, 4.2f).requiresCorrectToolForDrops()), ModCreativeModeTab.PALEOMOD_BLOCKS);

    public static final RegistryObject<Block> SANDSTONE_PLANT_FOSSIL_ORE = registerBlock("sandstone_plant_fossil_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.9f).requiresCorrectToolForDrops()), ModCreativeModeTab.PALEOMOD_BLOCKS);

    public static final RegistryObject<Block> SHALE = registerBlock("shale",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.PALEOMOD_BLOCKS);

    public static final RegistryObject<Block> SILTSTONE = registerBlock("siltstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.TUFF)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.PALEOMOD_BLOCKS);

    public static final RegistryObject<Block> LIMESTONE = registerBlock("limestone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.DRIPSTONE_BLOCK)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.PALEOMOD_BLOCKS);

    public static final RegistryObject<Block> GYPSUM_STONE = registerBlock("gypsum_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.BASALT)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.PALEOMOD_BLOCKS);

    public static final RegistryObject<Block> GYPSUM_COBBLESTONE = registerBlock("gypsum_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.BASALT)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.PALEOMOD_BLOCKS);

    public static final RegistryObject<Block> MARBLE = registerBlock("marble",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.DRIPSTONE_BLOCK)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.PALEOMOD_BLOCKS);

    public static final RegistryObject<Block> SILT = registerBlock("silt",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT).sound(SoundType.GRAVEL)
                    .strength(0.5f).requiresCorrectToolForDrops()), ModCreativeModeTab.PALEOMOD_BLOCKS);

    public static final RegistryObject<Block> HARDENED_SILT = registerBlock("hardened_silt",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT).sound(SoundType.PACKED_MUD)
                    .strength(0.8f).requiresCorrectToolForDrops()), ModCreativeModeTab.PALEOMOD_BLOCKS);

    public static final RegistryObject<Block> LOAM = registerBlock("loam",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT).sound(SoundType.GRAVEL)
                    .strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.PALEOMOD_BLOCKS);

    public static final RegistryObject<Block> PACKED_LOAM = registerBlock("packed_loam",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT).sound(SoundType.PACKED_MUD)
                    .strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.PALEOMOD_BLOCKS);

    public static final RegistryObject<Block> DIRT_MOSS = registerBlock("dirt_moss",
            () -> new Block(BlockBehaviour.Properties.of(Material.GRASS).sound(SoundType.ROOTED_DIRT)
                    .randomTicks().strength(0.6F).requiresCorrectToolForDrops()), ModCreativeModeTab.PALEOMOD_BLOCKS);

    public static final RegistryObject<Block> PEAT = registerBlock("peat",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT).sound(SoundType.GRAVEL)
                    .strength(0.6f).requiresCorrectToolForDrops()), ModCreativeModeTab.PALEOMOD_BLOCKS);

    public static final RegistryObject<Block> PEAT_MOSS = registerBlock("peat_moss",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT).sound(SoundType.ROOTED_DIRT)
                    .strength(0.7f).requiresCorrectToolForDrops()), ModCreativeModeTab.PALEOMOD_BLOCKS);


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
