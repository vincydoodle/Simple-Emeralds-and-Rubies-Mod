
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.skyeportal.ear.init;

import org.skyeportal.ear.EarMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class EarModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EarMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(EarModItems.AMETHYST_PICKAXE.get());
			tabData.accept(EarModItems.AMETHYST_AXE.get());
			tabData.accept(EarModItems.AMETHYST_SHOVEL.get());
			tabData.accept(EarModItems.AMETHYST_HOE.get());
			tabData.accept(EarModItems.COPPER_PICKAXE.get());
			tabData.accept(EarModItems.COPPER_AXE.get());
			tabData.accept(EarModItems.COPPER_SHOVEL.get());
			tabData.accept(EarModItems.COPPER_HOE.get());
			tabData.accept(EarModItems.QUARTZ_PICKAXE.get());
			tabData.accept(EarModItems.QUARTZ_AXE.get());
			tabData.accept(EarModItems.QUARTZ_SHOVEL.get());
			tabData.accept(EarModItems.QUARTZ_HOE.get());
			tabData.accept(EarModItems.EMERALD_PICKAXE.get());
			tabData.accept(EarModItems.EMERALD_AXE.get());
			tabData.accept(EarModItems.EMERALD_SHOVEL.get());
			tabData.accept(EarModItems.EMERALD_HOE.get());
			tabData.accept(EarModItems.RUBY_PICKAXE.get());
			tabData.accept(EarModItems.RUBY_AXE.get());
			tabData.accept(EarModItems.RUBY_SHOVEL.get());
			tabData.accept(EarModItems.RUBY_HOE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(EarModItems.AMETHYST_SWORD.get());
			tabData.accept(EarModItems.COPPER_SWORD.get());
			tabData.accept(EarModItems.QUARTZ_SWORD.get());
			tabData.accept(EarModItems.EMERALD_SWORD.get());
			tabData.accept(EarModItems.RUBY_SWORD.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(EarModItems.RUBY.get());
			tabData.accept(EarModItems.HARD_STICK.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(EarModBlocks.RUBYORE.get());
			tabData.accept(EarModBlocks.DEEPSLATE_RUBY_ORE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(EarModBlocks.RUBY_BLOCK.get());
		}
	}
}
