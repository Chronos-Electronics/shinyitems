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
            .food(new FoodComponent.Builder()
                    .hunger(15)
                    .saturationModifier(1.4f)
                    .snack().statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 60), 1)
                    .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 80), 1)
                    .alwaysEdible()
                    .build())
            .rarity(Rarity.RARE));
}
