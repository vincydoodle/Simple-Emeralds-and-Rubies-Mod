package org.skyeportal.ear.init;

import org.skyeportal.ear.block.RubyoreBlock;
import org.skyeportal.ear.block.DeepslateRubyOreBlock;
import org.skyeportal.ear.EarMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.item.CreativeModeTabs;

import java.util.function.Function;

public class EarModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(EarMod.MODID);

	public static final DeferredBlock<Block> RUBYORE = register("rubyore", RubyoreBlock::new);
	public static final DeferredBlock<Block> DEEPSLATE_RUBY_ORE = register("deepslate_ruby_ore", DeepslateRubyOreBlock::new);

	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		DeferredBlock<B> block = REGISTRY.registerBlock(name, supplier, BlockBehaviour.Properties.of());
		registerBlockItem(name, block);
		return block;
	}

	private static <B extends Block> void registerBlockItem(String name, DeferredBlock<B> block) {
		EarModItems.REGISTRY.registerItem(name, props -> new BlockItem(block.get(), new Item.Properties()));
	}
}
