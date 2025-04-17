
package org.skyeportal.ear.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class CopperAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 200, 5.5f, 0, 7, TagKey.create(Registries.ITEM, ResourceLocation.parse("ear:copper_axe_repair_items")));

	public CopperAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 8.3f, -3.3f, properties);
	}
}
