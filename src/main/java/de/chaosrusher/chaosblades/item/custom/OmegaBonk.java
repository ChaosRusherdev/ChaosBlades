package de.chaosrusher.chaosblades.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class OmegaBonk extends SwordItem {


    public OmegaBonk(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    public void onRightClick(World world, PlayerEntity player, Hand hand) {

        }
    }
