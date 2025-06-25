package yobi.modid.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import yobi.modid.Project2;

public class ModBlocks {
    public static final Block DRAGONS_DIAMOND_BLOCK = registerBlock("dragons_diamond_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.SCULK_SHRIEKER)));

    public static final Block DRAGONS_DIAMOND_ORE = registerBlock("dragons_diamond_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3f).requiresTool()));


    public static final Block LORDS_INGOT_BLOCK = registerBlock("lords_ingot_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.SCULK_SHRIEKER)));

    public static final Block LORDS_INGOT_ORE = registerBlock("lords_ingot_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3f).requiresTool()));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Project2.MOD_ID,name),block);
    }

    private static void registerBlockItem(String name, Block block)
    {
        Registry.register(Registries.ITEM, Identifier.of(Project2.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));

    }



    public static void registerModBlocks()
    {
        Project2.LOGGER.info("Registering Mod Blocks for " + Project2.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.DRAGONS_DIAMOND_BLOCK);
            fabricItemGroupEntries.add(ModBlocks.DRAGONS_DIAMOND_ORE);
            fabricItemGroupEntries.add(ModBlocks.LORDS_INGOT_BLOCK);
            fabricItemGroupEntries.add(ModBlocks.LORDS_INGOT_ORE);
        });

    }


}
