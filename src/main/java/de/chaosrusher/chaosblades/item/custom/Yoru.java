package de.chaosrusher.chaosblades.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Yoru extends SwordItem {
    public Yoru(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }



    public void passiveBuff(ItemUsageContext context){
        PlayerEntity playerEntity = context.getPlayer();
        World world = context.getWorld();
        if(playerEntity.getName().equals("ChaosRusher")&& playerEntity.getActiveHand() == Hand.MAIN_HAND){
            playerEntity.sendMessage(Text.of("works"));
        }
    }
}
