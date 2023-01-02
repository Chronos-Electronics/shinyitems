package com.chronos.shinyitems.registry.items.tools.RainbowTools;

import com.chronos.shinyitems.material.RainbowToolMaterial;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Rarity;
import net.minecraft.world.World;

import java.util.List;

import static com.chronos.shinyitems.registry.items.ModItems.SHINY_ITEM_GROUP_TOOLS;

public class Chainsaw extends AxeItem {
    public static final Chainsaw INSTANCE = new Chainsaw(15, -2, new Item.Settings()
            .group(SHINY_ITEM_GROUP_TOOLS)
            .rarity(Rarity.EPIC));


    public Chainsaw(int atk, float speed, Settings settings) {
        super(RainbowToolMaterial.INSTANCE, atk, speed, settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {


        // default white text
        tooltip.add(Text.translatable("item.shinyitems.chainsaw.tooltip"));

        // formatted red text
        tooltip.add(Text.translatable("item.shinyitems.chainsaw.ExtraText").formatted(Formatting.YELLOW));
    }

}
