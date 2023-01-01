package com.chronos.shinyitems.registry.items.RainbowTools;

import com.chronos.shinyitems.material.RainbowToolMaterial;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Rarity;
import net.minecraft.world.World;

import java.util.List;

import static com.chronos.shinyitems.registry.items.ModItems.SHINY_ITEM_GROUP_TOOLS;

public class Longsword extends SwordItem {
    public static final Longsword INSTANCE = new Longsword(13, -2.0f, new Item.Settings()
            .group(SHINY_ITEM_GROUP_TOOLS)
            .rarity(Rarity.EPIC));

    public Longsword(int attackDamage, float attackSpeed, Settings settings) {
        super(RainbowToolMaterial.INSTANCE, attackDamage, attackSpeed, settings);
    }

    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {


        // default white text
        tooltip.add(Text.translatable("item.shinyitems.longsword.tooltip"));

        // formatted red text
        tooltip.add(Text.translatable("item.shinyitems.longsword.ExtraText").formatted(Formatting.YELLOW));
    }
}
