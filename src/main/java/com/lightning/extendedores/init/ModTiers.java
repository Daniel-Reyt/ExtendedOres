package com.lightning.extendedores.init;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier SILVER = new ForgeTier(2, 250, 6.0F, 2.0F, 22, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.SILVER_INGOT.get()));
    public static final ForgeTier RUBYNITE = new ForgeTier(2, 250, 6.0F, 2.0F, 22, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.RUBYNITE_INGOT.get()));
    public static final ForgeTier CORUPTED = new ForgeTier(3, 1796, 8.5F, 3.5F, 10, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.SILVER_INGOT.get()));
    public static final ForgeTier ULTIMUM = new ForgeTier(4, 2031, 9.0F, 4.0F, 15, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.ULTIMUM_INGOT.get()));
}
