package de.pilz.sammelsorium;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import cpw.mods.fml.common.registry.GameRegistry;
import de.pilz.sammelsorium.configuration.BlocksAndItemsConfigs;

// spotless:off

public class RecipesManagement {

    public static void RegisterAllRecipes() {
        //var torch = Blocks.torch; // Oder auch so: GameRegistry.findItem("minecraft", "torch");

        // P r i s m a r i n e

        if (BlocksAndItemsConfigs.enablePrismarine) {
                // Prismarine Crystal Raw
                GameRegistry.addRecipe(new ShapedOreRecipe(
                        RegisterManagement.itemStackPrismarineCrystalRaw,
                        new Object[] {
                                "FF",
                                "FF",
                                'F', OreDictionaryManagement.ORE_SHARD_PRISMARINE
                        }));
        
                // Prismarine Crystal
                GameRegistry.addSmelting(
                        RegisterManagement.itemStackPrismarineCrystalRaw,
                        RegisterManagement.itemStackPrismarineCrystal,
                        0);
        
                // Sea Lantern
                GameRegistry.addRecipe(new ShapedOreRecipe(
                        new ItemStack(RegisterManagement.blockSeaLantern),
                        new Object[] {
                                "FFF",
                                "RFR",
                                "FFF",
                                'F', OreDictionaryManagement.ORE_CRYSTAL_PRISMARINE,
                                'R', OreDictionaryManagement.ORE_DUST_GLOWSTONE
                        }));
                
                // Sea Lantern -> Sea Lantern Colored
                GameRegistry.addRecipe(new ShapelessOreRecipe(
                        new ItemStack(RegisterManagement.blockSeaLantern, 1, 1),
                        new Object[] {
                                new ItemStack(RegisterManagement.blockSeaLantern, 1, OreDictionary.WILDCARD_VALUE),
                                OreDictionaryManagement.ORE_DYE_RED
                        }));
                
                // Sea Lantern Colored -> Sea Lantern
                GameRegistry.addRecipe(new ShapelessOreRecipe(
                        new ItemStack(RegisterManagement.blockSeaLantern),
                        new Object[] {
                                new ItemStack(RegisterManagement.blockSeaLantern, 1, OreDictionary.WILDCARD_VALUE)
                        }));
        }

        // G l o w   F l o w e r

        if (BlocksAndItemsConfigs.enableRedstoneFlower) {
                // Redstone Flower -> Dust
                GameRegistry.addShapelessRecipe(
                        new ItemStack(Items.redstone, 4, 0),
                        new Object[] {
                                RegisterManagement.itemFlowerRedstone,
                                RegisterManagement.itemFlowerRedstone,
                                RegisterManagement.itemFlowerRedstone
                        });
                
                // Redstone Flower -> Seeds
                GameRegistry.addShapelessRecipe(
                        new ItemStack(RegisterManagement.itemCropsRedstone, 2, 0),
                        new Object[] {
                                RegisterManagement.itemFlowerRedstone,
                                RegisterManagement.itemFlowerRedstone
                        });
                
                // Redstone Crops (Deco)
                addDecoRecipe(new ItemStack(RegisterManagement.blockCropsRedstoneDeco, 2, 0),
                        Items.wheat_seeds, OreDictionaryManagement.ORE_DYE_RED);
        }
    }

    private static void addDecoRecipe(ItemStack output, Object keyItem1, Object keyItem2) {
        if (BlocksAndItemsConfigs.enableDecoBlocksAndItems) {
                GameRegistry.addRecipe(new ShapelessOreRecipe(
                        output,
                        new Object[] {
                                OreDictionaryManagement.ORE_ITEM_CLAY,
                                OreDictionaryManagement.ORE_ITEM_CLAY,
                                keyItem1,
                                keyItem2
                        }));
        }
    }
}

// spotless:on
