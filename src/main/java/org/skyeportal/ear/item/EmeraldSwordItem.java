
package org.skyeportal.ear.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class EmeraldSwordItem extends SwordItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 230, 8f, 0, 25, TagKey.create(Registries.ITEM, ResourceLocation.parse("ear:emerald_sword_repair_items")));

	public EmeraldSwordItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 6f, -2f, properties);
	}
}
