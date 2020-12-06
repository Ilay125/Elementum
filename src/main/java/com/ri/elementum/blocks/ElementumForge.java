package com.ri.elementum.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class ElementumForge extends Block {

    public ElementumForge() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(6.0f, 22.5f)
                .sound(SoundType.METAL)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
