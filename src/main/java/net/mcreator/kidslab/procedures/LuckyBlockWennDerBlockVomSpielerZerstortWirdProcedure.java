package net.mcreator.kidslab.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.core.BlockPos;

import net.mcreator.kidslab.KidslabMod;

public class LuckyBlockWennDerBlockVomSpielerZerstortWirdProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double zufall = 0;
		zufall = (double) Math.random();
		if (zufall < 0.25) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.WARPED_PLANKS));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (zufall < 0.75) {
			world.setBlock(new BlockPos((int) x, (int) y, (int) z), Blocks.OAK_SAPLING.defaultBlockState(), 3);
		} else {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LAVA));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
		KidslabMod.LOGGER.info("Hall\u00F6chen!");
		KidslabMod.LOGGER.info(zufall);
	}
}
