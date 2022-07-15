package com.lightning.extendedores.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTab {
    public static final CreativeModeTab EXTENDEDORE_TAB_ORE = new CreativeModeTab("extendedore_tab_ore") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CORUPTEDITE_ORE.get());
        }
    };
    public static final CreativeModeTab EXTENDEDORE_TAB_INGOTS = new CreativeModeTab("extendedore_tab_ingots") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CORUPTEDITE_INGOT.get());
        }
    };
    public static final CreativeModeTab EXTENDEDORE_TAB_TOOLS = new CreativeModeTab("extendedore_tab_tools") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CORUPTEDITE_AXE.get());
        }
    };
}
