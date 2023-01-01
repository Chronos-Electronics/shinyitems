package com.chronos.shinyitems.registry.items;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;

public class Utilities {
    public static final Item BREAD_PACK = new Item(new Item.Settings()
            .group(ModItems.SHINY_ITEM_GROUP)
            .maxCount(64)
            .food(new FoodComponent.Builder().hunger(20).saturationModifier(20.0f).snack().statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 60), 0.75f).alwaysEdible().build())
            .rarity(Rarity.UNCOMMON));
}
