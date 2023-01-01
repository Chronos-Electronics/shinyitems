package com.chronos.shinyitems.registry.items;

import com.chronos.shinyitems.ShinyItemsMod;
import com.chronos.shinyitems.registry.items.RainbowTools.*;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;



public class ModItems {

    public static final ItemGroup SHINY_ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier(ShinyItemsMod.MOD_ID, "shiny_group"),
            () -> new ItemStack(Materials.SHINYMOND));

    public static final ItemGroup SHINY_ITEM_GROUP_TOOLS = FabricItemGroupBuilder.build(
            new Identifier(ShinyItemsMod.MOD_ID, "shiny_group_tools"),
            () -> new ItemStack(Materials.SHINYMOND));


    private static void registerItem(String name, Item item) {
        Registry.register(Registry.ITEM, new Identifier(ShinyItemsMod.MOD_ID, name), item);
    }


    public static void registerItems() {
        registerItem("shinymond", Materials.SHINYMOND);
        registerItem("shinyrald", Materials.SHINYRALD);
        registerItem("shiny_alloy", Materials.SHINY_ALLOY);
        registerItem("rainbow_alloy", Materials.RAINBOW_ALLOY);
        registerItem("bread_pack", Utilities.BREAD_PACK);
        registerItem("chainsaw", Chainsaw.INSTANCE);
        registerItem("longsword", Longsword.INSTANCE);
        registerItem("rainbow_hoe", RainbowHoe.INSTANCE);
        registerItem("rainbow_shovel", RainbowShovel.INSTANCE);
        registerItem("drill", Drill.INSTANCE);
    }
}
