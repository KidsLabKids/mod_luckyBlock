
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kidslab.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class KidslabModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item GREGORIUM = register(KidslabModBlocks.GREGORIUM, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item LUCKY_BLOCK = register(KidslabModBlocks.LUCKY_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item EINSTEIN = register(
			new SpawnEggItem(KidslabModEntities.EINSTEIN, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("einstein_spawn_egg"));

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
