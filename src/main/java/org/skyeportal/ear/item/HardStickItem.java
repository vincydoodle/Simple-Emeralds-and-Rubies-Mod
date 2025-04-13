
package org.skyeportal.ear.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class HardStickItem extends Item {
	public HardStickItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64));
	}
}
