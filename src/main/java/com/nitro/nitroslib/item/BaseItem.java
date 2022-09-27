package com.nitro.nitroslib.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class BaseItem extends Item {
    private final ResourceLocation id;
    private final String name;
    private final int[] colors;

    public BaseItem(ResourceLocation id, String name, int[] colors ) {
        super(new Properties());
        this.id = id;
        this.name = name;
        this.colors = colors;
    }
}
