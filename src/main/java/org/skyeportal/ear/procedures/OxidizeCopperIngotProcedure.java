package org.skyeportal.ear.procedures;

import org.skyeportal.ear.init.EarModItems;

import net.neoforged.neoforge.event.tick.EntityTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;
import net.neoforged.fml.earlydisplay.EarlyFramebuffer;

@EventBusSubscriber
public class OxidizeCopperIngotProcedure {
	@SubscribeEvent
	public static void onEntityTick(EntityTickEvent.Pre event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean condition = false;
		if (entity instanceof ItemEntity itemEnt) {
			if (itemEnt.getItem().getItem() == Items.COPPER_INGOT) {
				if (world.getBlockState(BlockPos.containing(x, y, z)).getBlock() == Blocks.WATER ||
					world.getBlockState(BlockPos.containing(x, y, z)).getBlock() == Blocks.BUBBLE_COLUMN) {
					if (world instanceof ServerLevel _level) {
						ItemEntity copper = (ItemEntity) entity;
						int count = copper.getItem().getCount();
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EarModItems.OXIDIZED_COPPER_INGOT.get(), count));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (!entity.level().isClientSide())
						entity.discard();
				}
			}
			else {
                ItemEntity _itemEnt = (ItemEntity) entity;
                if (_itemEnt.getItem().getItem() == EarModItems.COPPER_ROD.get()) {
                    if (world.getBlockState(BlockPos.containing(x, y, z)).getBlock() == Blocks.WATER ||
                        world.getBlockState(BlockPos.containing(x, y, z)).getBlock() == Blocks.BUBBLE_COLUMN) {
                        if (world instanceof ServerLevel _level) {
                            ItemEntity copper = (ItemEntity) entity;
                            int count = copper.getItem().getCount();
                            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EarModItems.OXIDIZED_COPPER_ROD.get(), count));
                            entityToSpawn.setPickUpDelay(10);
                            _level.addFreshEntity(entityToSpawn);
                        }
                        if (!entity.level().isClientSide())
                            entity.discard();
                    }
                }
            }
		}
	}
}
