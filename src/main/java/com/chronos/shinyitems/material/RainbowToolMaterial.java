package com.chronos.shinyitems.material;

import com.chronos.shinyitems.registry.items.Materials;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class RainbowToolMaterial implements ToolMaterial {
    public static final RainbowToolMaterial INSTANCE = new RainbowToolMaterial();

    @Override
    public int getDurability() {
        return 25000;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 13F;
    }

    @Override
    public float getAttackDamage() {
        return 0;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 22;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Materials.RAINBOW_ALLOY);
    }
}
