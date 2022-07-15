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
    public static final RegistryObject<Item> ULTIMUM_INGOT = ITEMS.register("ultimum_ingot", () -> new Item(new Item.Properties().stacksTo(1).tab(ModCreativeTab.EXTENDEDORE_TAB_INGOTS)));
    public static final RegistryObject<Item> RUBYNITE_INGOT = ITEMS.register("rubynite_ingot", () -> new Item(new Item.Properties().stacksTo(1).tab(ModCreativeTab.EXTENDEDORE_TAB_INGOTS)));

    // ORES
    public static final RegistryObject<BlockItem> SILVER_ORE = ITEMS.register("silver_ore", () -> new BlockItem(ModBlocks.SILVER_ORE.get(), new Item.Properties().stacksTo(64).tab(ModCreativeTab.EXTENDEDORE_TAB_ORE)));
    public static final RegistryObject<BlockItem> CORUPTEDITE_ORE = ITEMS.register("coruptedite_ore", () -> new BlockItem(ModBlocks.CORUPTEDITE_ORE.get(), new Item.Properties().stacksTo(64).tab(ModCreativeTab.EXTENDEDORE_TAB_ORE)));
    public static final RegistryObject<BlockItem> ULTIMUM_ORE = ITEMS.register("ultimum_ore", () -> new BlockItem(ModBlocks.ULTIMUM_ORE.get(), new Item.Properties().stacksTo(64).tab(ModCreativeTab.EXTENDEDORE_TAB_ORE)));
    public static final RegistryObject<BlockItem> RUBYNITE_ORE = ITEMS.register("rubynite_ore", () -> new BlockItem(ModBlocks.RUBYNITE_ORE.get(), new Item.Properties().stacksTo(64).tab(ModCreativeTab.EXTENDEDORE_TAB_ORE)));

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

    public static final RegistryObject<AxeItem> RUBYNITE_AXE = ITEMS.register("rubynite_axe", () -> new AxeItem(ModTiers.RUBYNITE, 4, 3, new Item.Properties().stacksTo(64).tab(ModCreativeTab.EXTENDEDORE_TAB_TOOLS)));
    public static final RegistryObject<PickaxeItem> RUBYNITE_PICKAXE = ITEMS.register("rubynite_pickaxe", () -> new PickaxeItem(ModTiers.RUBYNITE, 2, 3, new Item.Properties().stacksTo(64).tab(ModCreativeTab.EXTENDEDORE_TAB_TOOLS)));
    public static final RegistryObject<ShovelItem> RUBYNITE_SHOVEL = ITEMS.register("rubynite_shovel", () -> new ShovelItem(ModTiers.RUBYNITE, 2, 3, new Item.Properties().stacksTo(64).tab(ModCreativeTab.EXTENDEDORE_TAB_TOOLS)));
    public static final RegistryObject<HoeItem> RUBYNITE_HOE = ITEMS.register("rubynite_hoe", () -> new HoeItem(ModTiers.RUBYNITE, 2, 3, new Item.Properties().stacksTo(64).tab(ModCreativeTab.EXTENDEDORE_TAB_TOOLS)));
    public static final RegistryObject<SwordItem> RUBYNITE_SWORD = ITEMS.register("rubynite_sword", () -> new SwordItem(ModTiers.RUBYNITE, 2, 3, new Item.Properties().stacksTo(64).tab(ModCreativeTab.EXTENDEDORE_TAB_TOOLS)));

    public static final RegistryObject<AxeItem> ULTIMUM_AXE = ITEMS.register("ultimum_axe", () -> new AxeItem(ModTiers.ULTIMUM, 4, 3, new Item.Properties().stacksTo(64).tab(ModCreativeTab.EXTENDEDORE_TAB_TOOLS)));
    public static final RegistryObject<PickaxeItem> ULTIMUM_PICKAXE = ITEMS.register("ultimum_pickaxe", () -> new PickaxeItem(ModTiers.ULTIMUM, 2, 3, new Item.Properties().stacksTo(64).tab(ModCreativeTab.EXTENDEDORE_TAB_TOOLS)));
    public static final RegistryObject<ShovelItem> ULTIMUM_SHOVEL = ITEMS.register("ultimum_shovel", () -> new ShovelItem(ModTiers.ULTIMUM, 2, 3, new Item.Properties().stacksTo(64).tab(ModCreativeTab.EXTENDEDORE_TAB_TOOLS)));
    public static final RegistryObject<HoeItem> ULTIMUM_HOE = ITEMS.register("ultimum_hoe", () -> new HoeItem(ModTiers.ULTIMUM, 2, 3, new Item.Properties().stacksTo(64).tab(ModCreativeTab.EXTENDEDORE_TAB_TOOLS)));
    public static final RegistryObject<SwordItem> ULTIMUM_SWORD = ITEMS.register("ultimum_sword", () -> new SwordItem(ModTiers.ULTIMUM, 2, 3, new Item.Properties().stacksTo(64).tab(ModCreativeTab.EXTENDEDORE_TAB_TOOLS)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
