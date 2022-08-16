package com.mortimyrrh.mycelia.block.custom;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.FlowerBlock;

public class MyshroomBlock extends FlowerBlock {
    public MyshroomBlock(Properties properties) {
        super(MobEffects.HEAL, 0, properties);
    }
}