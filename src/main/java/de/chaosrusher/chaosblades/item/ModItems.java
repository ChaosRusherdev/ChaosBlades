package de.chaosrusher.chaosblades.item;

import de.chaosrusher.chaosblades.ChaosBlades;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RAW_ANIMONIUM = registerItem("raw_animonium",
            new Item(new FabricItemSettings()));
    public static final Item ANIMONIUM = registerItem("animonium",
            new Item(new FabricItemSettings()));
    public static final Item MOIR_KATANA =  registerItem("moir_katana",
            new SwordItem(ToolMaterials.NETHERITE,3,-2.7F,
                    new FabricItemSettings().maxDamage(1042)));

    public static final Item OMEGA_BONK = registerItem("omega_bonk",
            new SwordItem(ToolMaterials.NETHERITE,6,-3.4F,
                    new FabricItemSettings().maxDamage(4200)));
    public static final Item YORU = registerItem("yoru",
            new SwordItem(ToolMaterials.NETHERITE,5,-2.4F,
                    new FabricItemSettings().maxDamage(4200)));
    public static final Item MIHAWKS_TASCHENMESSER = registerItem("mihawks_taschenmesser",
            new SwordItem(ToolMaterials.NETHERITE,2,-1.4F,
                    new FabricItemSettings().maxDamage(4200)));




    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ChaosBlades.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ModItemGroup.CHAOSBLADES,RAW_ANIMONIUM);
        addToItemGroup(ModItemGroup.CHAOSBLADES, ANIMONIUM);
        addToItemGroup(ModItemGroup.CHAOSBLADES,MOIR_KATANA);
        addToItemGroup(ModItemGroup.CHAOSBLADES,OMEGA_BONK);
        addToItemGroup(ModItemGroup.CHAOSBLADES,YORU);
        addToItemGroup(ModItemGroup.CHAOSBLADES,MIHAWKS_TASCHENMESSER);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void registerModItems() {
        ChaosBlades.LOGGER.info("Registering Mod Items for " + ChaosBlades.MOD_ID);

        addItemsToItemGroup();
    }
}
