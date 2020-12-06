package com.ri.elementum.util;

import com.ri.elementum.blocks.*;
import com.ri.elementum.Elementum;
import com.ri.elementum.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Elementum.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Elementum.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //this is items you moron
    public static final RegistryObject<Item> CAPSULE = ITEMS.register("capsule", () -> new ItemBase(16));
    public static final RegistryObject<Item> THE_CAPSULE_OF_CONFUSION = ITEMS.register("the_capsule_of_confusion", ItemBase::new);
    public static final RegistryObject<Item> AQUARIUM = ITEMS.register("aquarium", ItemBase::new);
    public static final RegistryObject<Item> HELLFIRE_INGOT = ITEMS.register("hellfire_ingot", ItemBase::new);
    public static final RegistryObject<Item> DEEP_STONE = ITEMS.register("deep_stone", ItemBase::new);
    public static final RegistryObject<Item> AIRIUM_GEM = ITEMS.register("airium_gem", ItemBase::new);

    //fucking blocks idot
    public static final RegistryObject<Block> SHAPE_FORGE_BLOCK = BLOCKS.register("shape_forge", ShapeForge::new);
    public static final RegistryObject<Block> ENHANCEMENT_FORGE_BLOCK = BLOCKS.register("enhancement_forge", EnhancementForge::new);
    public static final RegistryObject<Block> ELEMENTUM_FORGE_FORGE = BLOCKS.register("elementum_forge", ElementumForge::new);
    public static final RegistryObject<Block> AQUARIUM_ORE_BLOCK = BLOCKS.register("aquarium_ore",  AquariumOre::new);
    public static final RegistryObject<Block> HELLFIRE_ORE_BLOCK = BLOCKS.register("hellfire_ore", HellfireOre::new);
    public static final RegistryObject<Block> DEEP_STONE_ORE_BLOCK = BLOCKS.register("deep_stone_ore", DeepStoneOre::new);
    public static final RegistryObject<Block> AIRIUM_ORE_BLOCK = BLOCKS.register("airium_ore", AiriumOre::new);


    //blocks items??? wtf the fuck
    public static final RegistryObject<Item> SHAPE_FORGE_ITEM = ITEMS.register("shape_forge", () -> new BlockItemBase(SHAPE_FORGE_BLOCK.get()));
    public static final RegistryObject<Item> ENHANCEMENT_FORGE_ITEM = ITEMS.register("enhancement_forge", () -> new BlockItemBase(ENHANCEMENT_FORGE_BLOCK.get()));
    public static final RegistryObject<Item> ELEMENTUM_FORGE_ITEM = ITEMS.register("elementum_forge", () -> new BlockItemBase(ELEMENTUM_FORGE_FORGE.get()));
    public static final RegistryObject<Item> AQUARIUM_ORE_ITEM = ITEMS.register("aquarium_ore", () -> new BlockItemBase(AQUARIUM_ORE_BLOCK.get()));
    public static final RegistryObject<Item> HELLFIRE_ORE_ITEM = ITEMS.register("hellfire_ore", () -> new BlockItemBase(HELLFIRE_ORE_BLOCK.get()));
    public static final RegistryObject<Item> DEEP_STONE_ORE_ITEM = ITEMS.register("deep_stone_ore", () -> new BlockItemBase(DEEP_STONE_ORE_BLOCK.get()));
    public static final RegistryObject<Item> AIRIUM_ORE_ITEM = ITEMS.register("airium_stone_ore", () -> new BlockItemBase(AIRIUM_ORE_BLOCK.get()));

}
