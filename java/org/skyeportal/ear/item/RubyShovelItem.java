
package org.skyeportal.ear.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ToolMaterial;

public class RubyShovelItem extends ShovelItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1000, 8f, 0, 15, TagKey.create(Registries.ITEM, ResourceLocation.parse("ear:ruby_shovel_repair_items")));

	public RubyShovelItem(Properties properties) {
		super(TOOL_MATERIAL, 1f, -3f, properties);
	}
}
