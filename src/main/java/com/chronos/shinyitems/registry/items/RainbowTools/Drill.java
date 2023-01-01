package com.chronos.shinyitems.registry.items.RainbowTools;

import com.chronos.shinyitems.material.RainbowToolMaterial;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Rarity;
import net.minecraft.world.World;

import java.util.List;

import static com.chronos.shinyitems.registry.items.ModItems.SHINY_ITEM_GROUP_TOOLS;

public class Drill extends PickaxeItem {
    public static final Drill INSTANCE = new Drill(7, -2.8f, new Settings()
            .group(SHINY_ITEM_GROUP_TOOLS)
            .rarity(Rarity.EPIC));


    public Drill(int atk, float speed, Settings settings) {
        super(RainbowToolMaterial.INSTANCE, atk, speed, settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {


        // default white text
        tooltip.add(Text.translatable("item.shinyitems.drill.tooltip"));

        // formatted red text
        tooltip.add(Text.translatable("item.shinyitems.drill.ExtraText").formatted(Formatting.YELLOW));
    }

}
