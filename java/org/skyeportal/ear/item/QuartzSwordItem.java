
package org.skyeportal.ear.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class QuartzSwordItem extends SwordItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 700, 8f, 0, 15, TagKey.create(Registries.ITEM, ResourceLocation.parse("ear:quartz_sword_repair_items")));

	public QuartzSwordItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 5.5f, -2.4f, properties);
	}
}
