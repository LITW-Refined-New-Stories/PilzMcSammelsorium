package de.pilz.sammelsorium;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import cpw.mods.fml.common.registry.GameRegistry;
import de.pilz.sammelsorium.blocks.BlockCropsRedstone;
import de.pilz.sammelsorium.blocks.BlockCropsRedstoneDeco;
import de.pilz.sammelsorium.blocks.BlockSeaLantern;
import de.pilz.sammelsorium.configuration.BlocksAndItemsConfigs;
import de.pilz.sammelsorium.items.ItemCropsRedstone;
import de.pilz.sammelsorium.items.ItemFlowersRedstone;
import de.pilz.sammelsorium.items.ItemPrismarine;
import de.pilz.sammelsorium.items.blocks.ItemBlockDeco;
import de.pilz.sammelsorium.items.blocks.ItemBlockSeaLantern;
import de.pilz.sammelsorium.strings.BlockNames;
import de.pilz.sammelsorium.strings.ItemNames;

public class RegisterManagement {

    public static Block blockSeaLantern = new BlockSeaLantern();
    public static Block blockCropsRedstone = new BlockCropsRedstone();
    public static Block blockCropsRedstoneDeco = new BlockCropsRedstoneDeco();

    public static Item itemCropsRedstone = new ItemCropsRedstone();
    public static Item itemFlowerRedstone = new ItemFlowersRedstone();

    public static Item itemPrismarine = new ItemPrismarine();
    public static ItemStack itemStackPrismarineShard = new ItemStack(itemPrismarine, 1, 0);
    public static ItemStack itemStackPrismarineCrystal = new ItemStack(itemPrismarine, 1, 1);
    public static ItemStack itemStackPrismarineCrystalRaw = new ItemStack(itemPrismarine, 1, 2);

    public static void RegisterAllItems() {
        if (BlocksAndItemsConfigs.enablePrismarine) {
            GameRegistry.registerItem(itemPrismarine, ItemNames.PRISMARINE_SHARD);
        }
        if (BlocksAndItemsConfigs.enableRedstoneFlower) {
            GameRegistry.registerItem(itemCropsRedstone, ItemNames.CROPS_REDSTONE);
            GameRegistry.registerItem(itemFlowerRedstone, ItemNames.FLOWERS_REDSTONE);
        }
    }

    public static void RegisterAllBlocks() {
        if (BlocksAndItemsConfigs.enablePrismarine) {
            GameRegistry.registerBlock(blockSeaLantern, ItemBlockSeaLantern.class, BlockNames.SEA_LANTERN);
        }
        if (BlocksAndItemsConfigs.enableRedstoneFlower) {
            GameRegistry.registerBlock(blockCropsRedstone, ItemBlock.class, BlockNames.CROPS_REDSTONE);
            if (BlocksAndItemsConfigs.enableDecoBlocksAndItems) {
                GameRegistry.registerBlock(blockCropsRedstoneDeco, ItemBlockDeco.class, BlockNames.CROPS_REDSTONE_DECO);
            }
        }
    }
}
