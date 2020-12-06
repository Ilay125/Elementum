package com.ri.elementum.items;

import com.ri.elementum.Elementum;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().group(Elementum.TAB));
    }

    public ItemBase(int maxStack) {
        super(new Item.Properties().maxStackSize(maxStack).group(Elementum.TAB));
    }
}
