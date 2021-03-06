package com.ri.elementum.util;

import com.ri.elementum.blocks.*;
import com.ri.elementum.Elementum;
import com.ri.elementum.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraft.item.PickaxeItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Elementum.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Elementum.MOD_ID);

    private static void RegisterToolsCapsules() {
        final String[] elements = {"empty", "hellfire", "aquarium", "deep_earth", "airium"};
        final String[] items = {"pickaxe", "axe", "sword", "hoe", "shovel", "helmet", "chestplate", "leggings", "boots"};
        final int[] durability = {0 ,500, 500, 750, 250};
        for (int e=0; e<elements.length; e++) {
            final int e2 = e;
            for (String i: items) {
                if (e==0){
                    ITEMS.register(elements[e]+"_"+i+"_capsule", () -> new ItemBase(1));
                } else {
                    ITEMS.register(elements[e] + "_" + i + "_capsule", () -> new ItemBase(1, durability[e2]));
                }
            }
        }
    }

    public static void init() {
        RegisterToolsCapsules();
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //this is items you moron
    public static final RegistryObject<Item> CAPSULE = ITEMS.register("capsule", () -> new ItemBase(16));
    public static final RegistryObject<Item> THE_CAPSULE_OF_CONFUSION = ITEMS.register("the_capsule_of_confusion", ItemBase::new);
    public static final RegistryObject<Item> AQUARIUM = ITEMS.register("aquarium", ItemBase::new);
    public static final RegistryObject<Item> HELLFIRE = ITEMS.register("hellfire", ItemBase::new);
    public static final RegistryObject<Item> DEEP_EARTH = ITEMS.register("deep_earth", ItemBase::new);
    public static final RegistryObject<Item> AIRIUM = ITEMS.register("airium", ItemBase::new);
    public static final RegistryObject<Item> BOSS_ESSENCE = ITEMS.register("boss_essence", () -> new ItemBase(16));


    //fucking blocks idot
    public static final RegistryObject<Block> SHAPE_FORGE = BLOCKS.register("shape_forge", ShapeForge::new);
    public static final RegistryObject<Block> ENHANCEMENT_FORGE = BLOCKS.register("enhancement_forge", EnhancementForge::new);
    public static final RegistryObject<Block> ELEMENTUM_FORGE = BLOCKS.register("elementum_forge", ElementumForge::new);
    public static final RegistryObject<Block> AQUARIUM_ORE = BLOCKS.register("aquarium_ore",  AquariumOre::new);
    public static final RegistryObject<Block> HELLFIRE_ORE = BLOCKS.register("hellfire_ore", HellfireOre::new);
    public static final RegistryObject<Block> DEEP_EARTH_ORE = BLOCKS.register("deep_earth_ore", DeepEarthOre::new);
    public static final RegistryObject<Block> AIRIUM_ORE = BLOCKS.register("airium_ore", AiriumOre::new);


    //blocks items??? wtf the fuck
    public static final RegistryObject<Item> SHAPE_FORGE_ITEM = ITEMS.register("shape_forge", () -> new BlockItemBase(SHAPE_FORGE.get()));
    public static final RegistryObject<Item> ENHANCEMENT_FORGE_ITEM = ITEMS.register("enhancement_forge", () -> new BlockItemBase(ENHANCEMENT_FORGE.get()));
    public static final RegistryObject<Item> ELEMENTUM_FORGE_ITEM = ITEMS.register("elementum_forge", () -> new BlockItemBase(ELEMENTUM_FORGE.get()));
    public static final RegistryObject<Item> AQUARIUM_ORE_ITEM = ITEMS.register("aquarium_ore", () -> new BlockItemBase(AQUARIUM_ORE.get()));
    public static final RegistryObject<Item> HELLFIRE_ORE_ITEM = ITEMS.register("hellfire_ore", () -> new BlockItemBase(HELLFIRE_ORE.get()));
    public static final RegistryObject<Item> DEEP_EARTH_ORE_ITEM = ITEMS.register("deep_earth_ore", () -> new BlockItemBase(DEEP_EARTH_ORE.get()));
    public static final RegistryObject<Item> AIRIUM_ORE_ITEM = ITEMS.register("airium_ore", () -> new BlockItemBase(AIRIUM_ORE.get()));

    //holy shit its the fucking tools

}
