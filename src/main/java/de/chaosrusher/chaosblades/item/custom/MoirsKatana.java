package de.chaosrusher.chaosblades.item.custom;

import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class MoirsKatana extends SwordItem {
    public MoirsKatana(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
    public void passiveBuff(PlayerEntity player, World world, Hand hand){
        if(player.getName().equals("MoriMoehre")){
        }
    }
}
