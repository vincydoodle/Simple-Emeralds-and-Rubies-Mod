
package org.skyeportal.ear.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class CopperRodItem extends Item {
	public CopperRodItem(Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64));
	}
}
