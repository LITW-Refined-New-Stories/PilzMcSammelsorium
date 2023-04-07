package de.pilz.sammelsorium;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import cpw.mods.fml.common.registry.GameRegistry;
import de.pilz.sammelsorium.blocks.*;
import de.pilz.sammelsorium.items.*;
import de.pilz.sammelsorium.items.blocks.*;
import de.pilz.sammelsorium.strings.BlockNames;
import de.pilz.sammelsorium.strings.ItemNames;

public class RegisterManagement {

    public static Block blockSeaLantern = new BlockSeaLantern();
    public static Block blockCropsRedstone = new BlockCropsRedstone();

    public static Item itemCropsRedstone = new ItemCropsRedstone();
    public static Item itemFlowerRedstone = new ItemFlowersRedstone();

    public static Item itemPrismarine = new ItemPrismarine();
    public static ItemStack itemStackPrismarineShard = new ItemStack(itemPrismarine, 0, 0);
    public static ItemStack itemStackPrismarineCrystal = new ItemStack(itemPrismarine, 1, 0);
    public static ItemStack itemStackPrismarineCrystalRaw = new ItemStack(itemPrismarine, 2, 0);

    public static void RegisterAllItems() {
        GameRegistry.registerItem(itemCropsRedstone, ItemNames.CROPS_REDSTONE);
        GameRegistry.registerItem(itemFlowerRedstone, ItemNames.FLOWERS_REDSTONE);
        GameRegistry.registerItem(itemPrismarine, ItemNames.PRISMARINE_SHARD);
    }

    public static void RegisterAllBlocks() {
        GameRegistry.registerBlock(blockSeaLantern, ItemBlockSeaLantern.class, BlockNames.SEA_LANTERN);
        GameRegistry.registerBlock(blockCropsRedstone, ItemBlock.class, BlockNames.CROPS_REDSTONE);
    }
}
