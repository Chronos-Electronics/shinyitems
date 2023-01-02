package com.chronos.shinyitems.registry.items.tools.RainbowTools;

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

public class Gog extends SwordItem {
    public static final Gog INSTANCE = new Gog(15, -2.0f, new Item.Settings()
            .group(SHINY_ITEM_GROUP_TOOLS)
            .rarity(Rarity.EPIC));

    public Gog(int attackDamage, float attackSpeed, Settings settings) {
        super(RainbowToolMaterial.INSTANCE, attackDamage, attackSpeed, settings);
    }

    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {


        // default white text
        tooltip.add(Text.translatable("item.shinyitems.gog.tooltip"));

        // formatted red text
        tooltip.add(Text.translatable("item.shinyitems.gog.ExtraText").formatted(Formatting.YELLOW));
        tooltip.add(Text.translatable("item.shinyitems.gog.ExtraText2").formatted(Formatting.YELLOW));
    }
}
