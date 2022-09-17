package net.craftycatdevs.ccdpaleomod.item;

import net.craftycatdevs.ccdpaleomod.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab PALEOMOD_BLOCKS = new CreativeModeTab("paleomodblocks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.AMBER_BLOCK.get());
        }
    };

    public static final CreativeModeTab PALEOMOD_ITEMS = new CreativeModeTab("paleomoditems") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.AMBER_MOSQUITO.get());
        }
    };
}
