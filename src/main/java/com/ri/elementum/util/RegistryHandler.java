package com.ri.elementum.util;

import com.ri.elementum.blocks.BlockItemBase;
import com.ri.elementum.blocks.ElementumForgeBlock;
import com.ri.elementum.blocks.EnhancementForgeBlock;
import com.ri.elementum.blocks.ShapeForgeBlock;
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
    public static final RegistryObject<Item> AQUARIUM_INGOT = ITEMS.register("aquarium_ingot", ItemBase::new);
    public static final RegistryObject<Item> HELLFIRE_INGOT = ITEMS.register("hellfire_ingot", ItemBase::new);
    public static final RegistryObject<Item> DEEP_STONE = ITEMS.register("deep_stone", ItemBase::new);
    public static final RegistryObject<Item> AIR_GEM = ITEMS.register("air_gem", ItemBase::new);

    //fucking blocks idot
    public static final RegistryObject<Block> SHAPE_FORGE_BLOCK = BLOCKS.register("shape_forge_block", ShapeForgeBlock::new);
    public static final RegistryObject<Block> ENHANCEMENT_FORGE_BLOCK = BLOCKS.register("enhancement_forge_block", EnhancementForgeBlock::new);
    public static final RegistryObject<Block> ELEMENTUM_FORGE_FORGE = BLOCKS.register("elementum_forge_block", ElementumForgeBlock::new);

    //blocks items??? wtf the fuck
    public static final RegistryObject<Item> SHAPE_FORGE_ITEM = ITEMS.register("shape_forge_block", () -> new BlockItemBase(SHAPE_FORGE_BLOCK.get()));
    public static final RegistryObject<Item> ENHANCEMENT_FORGE_ITEM = ITEMS.register("enhancement_forge_block", () -> new BlockItemBase(ENHANCEMENT_FORGE_BLOCK.get()));
    public static final RegistryObject<Item> ELEMENTUM_FORGE_ITEM = ITEMS.register("elementum_forge_block", () -> new BlockItemBase(ELEMENTUM_FORGE_FORGE.get()));
}
