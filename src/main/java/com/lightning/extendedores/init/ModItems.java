package com.lightning.extendedores.init;

import com.lightning.extendedores.utils.References;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, References.MODID);

    // ITEMS
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", () -> new Item(new Item.Properties().stacksTo(1).tab(ModCreativeTab.EXTENDEDORE_TAB_INGOTS)));
    public static final RegistryObject<Item> CORUPTEDITE_INGOT = ITEMS.register("coruptedite_ingot", () -> new Item(new Item.Properties().stacksTo(1).tab(ModCreativeTab.EXTENDEDORE_TAB_INGOTS)));

    // ORES
    public static final RegistryObject<BlockItem> SILVER_ORE = ITEMS.register("silver_ore", () -> new BlockItem(ModBlocks.SILVER_ORE.get(), new Item.Properties().stacksTo(64).tab(ModCreativeTab.EXTENDEDORE_TAB_ORE)));
    public static final RegistryObject<BlockItem> CORUPTEDITE_ORE = ITEMS.register("coruptedite_ore", () -> new BlockItem(ModBlocks.CORUPTEDITE_ORE.get(), new Item.Properties().stacksTo(64).tab(ModCreativeTab.EXTENDEDORE_TAB_ORE)));

    // TOOLS
    public static final RegistryObject<AxeItem> CORUPTEDITE_AXE = ITEMS.register("coruptedite_axe", () -> new AxeItem(ModTiers.CORUPTED, 4, 3, new Item.Properties().stacksTo(64).tab(ModCreativeTab.EXTENDEDORE_TAB_TOOLS)));
    public static final RegistryObject<PickaxeItem> CORUPTEDITE_PICKAXE = ITEMS.register("coruptedite_pickaxe", () -> new PickaxeItem(ModTiers.CORUPTED, 2, 3, new Item.Properties().stacksTo(64).tab(ModCreativeTab.EXTENDEDORE_TAB_TOOLS)));
    public static final RegistryObject<ShovelItem> CORUPTEDITE_SHOVEL = ITEMS.register("coruptedite_shovel", () -> new ShovelItem(ModTiers.CORUPTED, 2, 3, new Item.Properties().stacksTo(64).tab(ModCreativeTab.EXTENDEDORE_TAB_TOOLS)));
    public static final RegistryObject<HoeItem> CORUPTEDITE_HOE = ITEMS.register("coruptedite_hoe", () -> new HoeItem(ModTiers.CORUPTED, 2, 3, new Item.Properties().stacksTo(64).tab(ModCreativeTab.EXTENDEDORE_TAB_TOOLS)));
    public static final RegistryObject<SwordItem> CORUPTEDITE_SWORD = ITEMS.register("coruptedite_sword", () -> new SwordItem(ModTiers.CORUPTED, 2, 3, new Item.Properties().stacksTo(64).tab(ModCreativeTab.EXTENDEDORE_TAB_TOOLS)));

    public static final RegistryObject<AxeItem> SILVER_AXE = ITEMS.register("silver_axe", () -> new AxeItem(ModTiers.SILVER, 4, 3, new Item.Properties().stacksTo(64).tab(ModCreativeTab.EXTENDEDORE_TAB_TOOLS)));
    public static final RegistryObject<PickaxeItem> SILVER_PICKAXE = ITEMS.register("silver_pickaxe", () -> new PickaxeItem(ModTiers.SILVER, 2, 3, new Item.Properties().stacksTo(64).tab(ModCreativeTab.EXTENDEDORE_TAB_TOOLS)));
    public static final RegistryObject<ShovelItem> SILVER_SHOVEL = ITEMS.register("silver_shovel", () -> new ShovelItem(ModTiers.SILVER, 2, 3, new Item.Properties().stacksTo(64).tab(ModCreativeTab.EXTENDEDORE_TAB_TOOLS)));
    public static final RegistryObject<HoeItem> SILVER_HOE = ITEMS.register("silver_hoe", () -> new HoeItem(ModTiers.SILVER, 2, 3, new Item.Properties().stacksTo(64).tab(ModCreativeTab.EXTENDEDORE_TAB_TOOLS)));
    public static final RegistryObject<SwordItem> SILVER_SWORD = ITEMS.register("silver_sword", () -> new SwordItem(ModTiers.SILVER, 2, 3, new Item.Properties().stacksTo(64).tab(ModCreativeTab.EXTENDEDORE_TAB_TOOLS)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
