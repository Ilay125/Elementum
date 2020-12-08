package com.ri.elementum.items;

import com.ri.elementum.Elementum;
import net.minecraft.item.Item;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().group(Elementum.TAB));
    }

    public ItemBase(int maxStack) {
        super(new Item.Properties().maxStackSize(maxStack).setNoRepair().group(Elementum.TAB));
    }

    public ItemBase(int maxStack, int maxDamage) {
        super(new Item.Properties().maxStackSize(maxStack).maxDamage(maxDamage).setNoRepair().group(Elementum.TAB));
    }
}
