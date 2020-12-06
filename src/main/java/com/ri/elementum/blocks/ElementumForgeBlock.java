package com.ri.elementum.blocks;

import com.ri.elementum.Elementum;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class ElementumForgeBlock extends Block {

    public ElementumForgeBlock() {
        super(Block.Properties.create(Material.SAND)
                .hardnessAndResistance(6.0f, 22.5f)
                .sound(SoundType.METAL)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
