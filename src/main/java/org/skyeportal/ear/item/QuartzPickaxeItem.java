
package org.skyeportal.ear.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class QuartzPickaxeItem extends PickaxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 700, 8f, 0, 15, TagKey.create(Registries.ITEM, ResourceLocation.parse("ear:quartz_pickaxe_repair_items")));

	public QuartzPickaxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 3.5f, -2.8f, properties);
	}
}
