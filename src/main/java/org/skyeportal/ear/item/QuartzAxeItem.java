
package org.skyeportal.ear.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class QuartzAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 700, 7f, 0, 15, TagKey.create(Registries.ITEM, ResourceLocation.parse("ear:quartz_axe_repair_items")));

	public QuartzAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 8f, 2f, properties);
	}
}
