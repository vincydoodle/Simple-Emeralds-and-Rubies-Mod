
package org.skyeportal.ear.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ToolMaterial;

public class RubyAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1000, 7f, 0, 15, TagKey.create(Registries.ITEM, ResourceLocation.parse("ear:ruby_axe_repair_items")));

	public RubyAxeItem(Properties properties) {
		super(TOOL_MATERIAL, 8f, 2f, properties);
	}
}
