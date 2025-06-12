package yobi.modid.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import yobi.modid.Project2;

public class ModItems {
    public static final Item DRAGONS_DIAMOND = registerItem("dragons_diamond", new Item(new Item.Settings()));
    public static final Item LORDS_INGOT = registerItem("lords_ingot", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Project2.MOD_ID, name), item);


    }


    public static void registerModItems() {
        Project2.LOGGER.info("Regisetering Mod Items for " + Project2.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(DRAGONS_DIAMOND);
            fabricItemGroupEntries.add(LORDS_INGOT);

        });

    }
}
