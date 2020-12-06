package com.ri.elementum.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class HellfireOre extends Block {

    public HellfireOre() {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(3f, 1.5f)
                .sound(SoundType.STONE)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}

