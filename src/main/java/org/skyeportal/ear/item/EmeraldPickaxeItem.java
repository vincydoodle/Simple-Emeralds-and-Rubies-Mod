
package org.skyeportal.ear.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class EmeraldPickaxeItem extends PickaxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 230, 25f, 0, 21, TagKey.create(Registries.ITEM, ResourceLocation.parse("ear:emerald_pickaxe_repair_items")));

	public EmeraldPickaxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 4f, -2f, properties);
	}
}
