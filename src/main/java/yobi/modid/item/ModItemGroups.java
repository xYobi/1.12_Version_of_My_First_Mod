package yobi.modid.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import yobi.modid.Project2;
import yobi.modid.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup LORD_DRAGONS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Project2.MOD_ID,"lords_dragons_items"),
            FabricItemGroup.builder().icon(()-> new ItemStack(ModItems.DRAGONS_DIAMOND))
                    .displayName(Text.translatable("itemgroup.tutorialmod.lords_dragons_items"))
                    .entries(((displayContext, entries) ->
                    {
                        entries.add(ModItems.LORDS_INGOT);
                        entries.add(ModItems.DRAGONS_DIAMOND);
                        entries.add(ModBlocks.DRAGONS_DIAMOND_ORE);
                        entries.add(ModBlocks.DRAGONS_DIAMOND_BLOCK);
                    })).build());

    public static void registerItemGroup()
    {
        Project2.LOGGER.info("Registering Item Groups for " + Project2.MOD_ID);
    }






}
