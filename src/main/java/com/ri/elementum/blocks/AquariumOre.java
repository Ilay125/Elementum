package com.ri.elementum.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class AquariumOre extends Block {

    public AquariumOre() {
        super(Block.Properties.create(Material.SAND)
                .hardnessAndResistance(2f, 0.5f)
                .sound(SoundType.SAND)
                .harvestLevel(3)
                .harvestTool(ToolType.SHOVEL)
        );
    }
}

