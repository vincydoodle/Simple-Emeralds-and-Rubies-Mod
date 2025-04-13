
package org.skyeportal.ear.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class EmeraldHoeItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 230, 8f, 0, 25, TagKey.create(Registries.ITEM, ResourceLocation.parse("ear:emerald_hoe_repair_items")));

	public EmeraldHoeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 11f, 0f, properties);
	}
}
