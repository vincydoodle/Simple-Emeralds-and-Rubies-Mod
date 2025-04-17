
package org.skyeportal.ear.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class EmeraldShovelItem extends ShovelItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 230, 8f, 0, 25, TagKey.create(Registries.ITEM, ResourceLocation.parse("ear:emerald_shovel_repair_items")));

	public EmeraldShovelItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 1.75f, -2f, properties);
	}
}
