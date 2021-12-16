
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kidslab.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;

import net.mcreator.kidslab.block.LuckyBlockBlock;
import net.mcreator.kidslab.block.GregoriumBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class KidslabModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block GREGORIUM = register(new GregoriumBlock());
	public static final Block LUCKY_BLOCK = register(new LuckyBlockBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}
}
