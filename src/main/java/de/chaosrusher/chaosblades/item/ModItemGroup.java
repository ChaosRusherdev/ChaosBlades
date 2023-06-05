package de.chaosrusher.chaosblades.item;

import de.chaosrusher.chaosblades.ChaosBlades;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup CHAOSBLADES;

    public static void registerItemGroups() {
        CHAOSBLADES = FabricItemGroup.builder(new Identifier(ChaosBlades.MOD_ID, "chaosblades"))
                .displayName(Text.translatable("ChaosBlades"))
                .icon(() -> new ItemStack(ModItems.ANIMONIUM)).build();
    }
}
