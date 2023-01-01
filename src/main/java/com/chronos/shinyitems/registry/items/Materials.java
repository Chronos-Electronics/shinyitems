package com.chronos.shinyitems.registry.items;

import net.minecraft.item.Item;
import net.minecraft.util.Rarity;

public class Materials {
    public static final Item SHINYMOND = new Item(new Item.Settings()
            .group(ModItems.SHINY_ITEM_GROUP)
            .rarity(Rarity.UNCOMMON));
    public static final Item SHINYRALD = new Item( new Item.Settings()
            .group(ModItems.SHINY_ITEM_GROUP)
            .rarity(Rarity.UNCOMMON));
    public static final Item SHINY_ALLOY = new Item(new Item.Settings()
            .group(ModItems.SHINY_ITEM_GROUP)
            .rarity(Rarity.UNCOMMON));
    public static final Item RAINBOW_ALLOY = new Item(new Item.Settings()
            .group(ModItems.SHINY_ITEM_GROUP)
            .rarity(Rarity.RARE));
}
