package com.ri.elementum.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class AiriumOreBlock extends Block {

    public AiriumOreBlock() {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(5f, 3f)
                .sound(SoundType.STONE)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}

