package com.mortimyrrh.mycelia.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;

public class MycelialLodestoneBlock extends Block {

    public static final BooleanProperty LIT = BooleanProperty.create("lit");

    public MycelialLodestoneBlock() {
        super(BlockBehaviour.Properties.copy(Blocks.LODESTONE)
                .lightLevel(state -> state.getValue(MycelialLodestoneBlock.LIT) ? 15 : 0));
    }

    @Override
    public InteractionResult use(BlockState blockState, Level level, BlockPos blockPos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        player.sendSystemMessage(Component.literal("Right Clicked Me"));

        if(!level.isClientSide() && hand == InteractionHand.MAIN_HAND) {
            level.setBlock(blockPos, blockState.cycle(LIT), 3);
        }
        return super.use(blockState, level, blockPos, player, hand, hitResult);
    }

    @Override
    public void stepOn(Level level, BlockPos blockPos, BlockState blockState, Entity entity) {
        if(entity instanceof LivingEntity livingEntity) {
            livingEntity.addEffect(new MobEffectInstance(MobEffects.JUMP, 200));
        }

        super.stepOn(level, blockPos, blockState, entity);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(LIT);
        super.createBlockStateDefinition(builder);
    }
}
