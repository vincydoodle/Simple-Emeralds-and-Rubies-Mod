
package org.skyeportal.ear.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class OxidizedCopperIngotItem extends Item {
	public OxidizedCopperIngotItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64));
	}
}
