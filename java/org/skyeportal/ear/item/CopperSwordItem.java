
package org.skyeportal.ear.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class CopperSwordItem extends SwordItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 200, 5.5f, 0, 7, TagKey.create(Registries.ITEM, ResourceLocation.parse("ear:copper_sword_repair_items")));

	public CopperSwordItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 4.5f, -2.7f, properties);
	}
}
