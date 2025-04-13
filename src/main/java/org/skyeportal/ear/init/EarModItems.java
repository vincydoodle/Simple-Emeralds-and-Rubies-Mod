
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.skyeportal.ear.init;

import net.minecraft.world.item.BlockItem;
import org.skyeportal.ear.item.*;
import org.skyeportal.ear.EarMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import java.util.function.Function;

public class EarModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(EarMod.MODID);
	public static final DeferredItem<Item> AMETHYST_PICKAXE = registerItem("amethyst_pickaxe", AmethystPickaxeItem::new);
	public static final DeferredItem<Item> AMETHYST_AXE = registerItem("amethyst_axe", AmethystAxeItem::new);
	public static final DeferredItem<Item> AMETHYST_SWORD = registerItem("amethyst_sword", AmethystSwordItem::new);
	public static final DeferredItem<Item> AMETHYST_SHOVEL = registerItem("amethyst_shovel", AmethystShovelItem::new);
	public static final DeferredItem<Item> AMETHYST_HOE = registerItem("amethyst_hoe", AmethystHoeItem::new);
	public static final DeferredItem<Item> COPPER_ROD = registerItem("copper_rod", CopperRodItem::new);
	public static final DeferredItem<Item> OXIDIZED_COPPER_ROD = registerItem("oxidized_copper_rod", OxidizedCopperRodItem::new);
	public static final DeferredItem<Item> OXIDIZED_COPPER_INGOT = registerItem("oxidized_copper_ingot", OxidizedCopperIngotItem::new);
	public static final DeferredItem<Item> COPPER_PICKAXE = registerItem("copper_pickaxe", CopperPickaxeItem::new);
	public static final DeferredItem<Item> COPPER_AXE = registerItem("copper_axe", CopperAxeItem::new);
	public static final DeferredItem<Item> COPPER_SWORD = registerItem("copper_sword", CopperSwordItem::new);
	public static final DeferredItem<Item> COPPER_SHOVEL = registerItem("copper_shovel", CopperShovelItem::new);
	public static final DeferredItem<Item> COPPER_HOE = registerItem("copper_hoe", CopperHoeItem::new);
	public static final DeferredItem<Item> HARD_STICK = registerItem("hard_stick", HardStickItem::new);
	public static final DeferredItem<Item> QUARTZ_PICKAXE = registerItem("quartz_pickaxe", QuartzPickaxeItem::new);
	public static final DeferredItem<Item> QUARTZ_AXE = registerItem("quartz_axe", QuartzAxeItem::new);
	public static final DeferredItem<Item> QUARTZ_SWORD = registerItem("quartz_sword", QuartzSwordItem::new);
	public static final DeferredItem<Item> QUARTZ_SHOVEL = registerItem("quartz_shovel", QuartzShovelItem::new);
	public static final DeferredItem<Item> QUARTZ_HOE = registerItem("quartz_hoe", QuartzHoeItem::new);
	public static final DeferredItem<Item> EMERALD_PICKAXE = registerItem("emerald_pickaxe", EmeraldPickaxeItem::new);
	public static final DeferredItem<Item> EMERALD_AXE = registerItem("emerald_axe", EmeraldAxeItem::new);
	public static final DeferredItem<Item> EMERALD_SWORD = registerItem("emerald_sword", EmeraldSwordItem::new);
	public static final DeferredItem<Item> EMERALD_SHOVEL = registerItem("emerald_shovel", EmeraldShovelItem::new);
	public static final DeferredItem<Item> EMERALD_HOE = registerItem("emerald_hoe", EmeraldHoeItem::new);
	public static final DeferredItem<Item> RUBY = registerItem("ruby", RubyItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> registerItem(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}
}
