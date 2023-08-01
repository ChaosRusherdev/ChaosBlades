package de.chaosrusher.chaosblades.item;

import de.chaosrusher.chaosblades.ChaosBlades;
import de.chaosrusher.chaosblades.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup CHAOSBLADES = Registry.register(Registries.ITEM_GROUP, new Identifier(ChaosBlades.MOD_ID,"chaosblades"),
            CHAOSBLADES = FabricItemGroup.builder()
                    .displayName(Text.translatable("ChaosBlades"))
                    .icon(() -> new ItemStack(ModItems.ANIMONIUM)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ANIMONIUM);
                        entries.add(ModItems.RAW_ANIMONIUM);
                        entries.add(ModItems.FLORATANA);
                        entries.add(ModItems.YORU);
                        entries.add(ModItems.MOIR_KATANA);
                        entries.add(ModItems.MIHAWKS_TASCHENMESSER);
                        entries.add(ModItems.OMEGA_BONK);

                        entries.add(ModBlocks.ANIMONIUM_BLOCK);
                        entries.add(ModBlocks.ANIMONIUM_ORE);
                    }).build());

    public static void registerItemGroups() {

    }
}
