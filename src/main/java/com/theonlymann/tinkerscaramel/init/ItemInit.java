package com.theonlymann.tinkerscaramel.init;

import com.theonlymann.tinkerscaramel.TinkersCaramel;
import com.theonlymann.tinkerscaramel.item.BreadPileBlockItem;
import com.theonlymann.tinkerscaramel.item.CaramelBlockItem;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            TinkersCaramel.MOD_ID);

    public static final RegistryObject<Item> SUGAR_SHARD = ITEMS.register("sugar_shard",
            () -> new Item(new Item.Properties().tab(TinkersCaramel.TINKERS_CARAMEL_GROUP)));

    public static final RegistryObject<Item> CARAMEL_CRYSTAL = ITEMS.register("caramel_crystal",
            () -> new Item(new Item.Properties().tab(TinkersCaramel.TINKERS_CARAMEL_GROUP)));
    //foods

    public static final RegistryObject<Item> CARAMEL_APPLE = ITEMS.register("caramel_apple",
            () -> new Item(new Item.Properties().tab(TinkersCaramel.TINKERS_CARAMEL_GROUP)
                    .food(new Food.Builder().nutrition(2).saturationMod(0.2F)
                            .effect(() -> new EffectInstance(Effects.SATURATION, 10, 0), 1.0F)
                            .effect(() -> new EffectInstance(Effects.HUNGER, 20 * 20, 0), 1.0F).build())
                    .stacksTo(1)));
    public static final RegistryObject<Item> GLAZED_BERRIES = ITEMS.register("glazed_berries",
            () -> new Item(new Item.Properties().tab(TinkersCaramel.TINKERS_CARAMEL_GROUP)
                    .food(new Food.Builder().nutrition(2).saturationMod(0.2F)
                            .effect(() -> new EffectInstance(Effects.HEAL, 1, 0), 1.0F)
                            .effect(() -> new EffectInstance(Effects.CONFUSION, 100, 0), 1.0F)
                            .build())
                    .stacksTo(4)));

    public static final RegistryObject<Item> CARROT_BACON = ITEMS.register("carrot_bacon",
            () -> new Item(new Item.Properties().tab(TinkersCaramel.TINKERS_CARAMEL_GROUP)
                    .food(new Food.Builder().nutrition(4).saturationMod(0.6F).build())));
    public static final RegistryObject<Item> CANDIED_BACON = ITEMS.register("candied_bacon",
            () -> new Item(new Item.Properties().tab(TinkersCaramel.TINKERS_CARAMEL_GROUP)
                    .food(new Food.Builder().nutrition(8).saturationMod(0.6F).build())));
    public static final RegistryObject<SoupItem> CARAMEL_FISH = ITEMS.register("caramel_fish",
            () -> new SoupItem(new Item.Properties().tab(TinkersCaramel.TINKERS_CARAMEL_GROUP)
                    .stacksTo(1).food(new Food.Builder().nutrition(10).saturationMod(0.6F).build())));

    //foods-infused caramels
    public static final RegistryObject<CaramelBlockItem> INFUSED_CARAMEL_EARTHSLIME = ITEMS.register("infused_caramel_earthslime",
            () -> new CaramelBlockItem(BlockInit.INFUSED_CARAMEL_EARTHSLIME.get(),new Item.Properties().tab(TinkersCaramel.TINKERS_CARAMEL_GROUP)
                    .food(new Food.Builder().fast().alwaysEat().nutrition(3).saturationMod(0.2F)
                            .effect(() -> new EffectInstance(Effects.LUCK, 20 * 15, 0), 1.0F).build())
                    .stacksTo(16)));
    public static final RegistryObject<CaramelBlockItem> INFUSED_CARAMEL_SKYSLIME = ITEMS.register("infused_caramel_skyslime",
            () -> new CaramelBlockItem(BlockInit.INFUSED_CARAMEL_SKYSLIME.get(), new Item.Properties().tab(TinkersCaramel.TINKERS_CARAMEL_GROUP)
                    .food(new Food.Builder().fast().alwaysEat().nutrition(3).saturationMod(0.2F)
                            .effect(() -> new EffectInstance(Effects.JUMP, 20 * 20, 1), 1.0F).build())
                    .stacksTo(16)));
    public static final RegistryObject<CaramelBlockItem> INFUSED_CARAMEL_BLOOD = ITEMS.register("infused_caramel_blood",
            () -> new CaramelBlockItem(BlockInit.INFUSED_CARAMEL_BLOOD.get(),new Item.Properties().tab(TinkersCaramel.TINKERS_CARAMEL_GROUP)
                    .food(new Food.Builder().fast().alwaysEat().nutrition(3).saturationMod(0.3F)
                            .effect(() -> new EffectInstance(Effects.REGENERATION, 50 * 3, 0), 1.0F).build())
                    .stacksTo(16)));
    public static final RegistryObject<CaramelBlockItem> INFUSED_CARAMEL_ICHOR = ITEMS.register("infused_caramel_ichor",
            () -> new CaramelBlockItem(BlockInit.INFUSED_CARAMEL_ICHOR.get(), new Item.Properties().tab(TinkersCaramel.TINKERS_CARAMEL_GROUP)
                    .food(new Food.Builder().fast().alwaysEat().nutrition(3).saturationMod(0.2F)
                            .effect(() -> new EffectInstance(Effects.ABSORPTION, 20 * 30, 0), 1.0F).build())
                    .stacksTo(16)));
    public static final RegistryObject<CaramelBlockItem> INFUSED_CARAMEL_ENDERSLIME = ITEMS.register("infused_caramel_enderslime",
            () -> new CaramelBlockItem(BlockInit.INFUSED_CARAMEL_ENDERSLIME.get(), new Item.Properties().tab(TinkersCaramel.TINKERS_CARAMEL_GROUP)
                    .food(new Food.Builder().fast().alwaysEat().nutrition(3).saturationMod(0.3F)
                            .effect(() -> new EffectInstance(Effects.LEVITATION, 20 * 10, 0), 1.0F).build())
                    .stacksTo(16)));
    public static final RegistryObject<CaramelBlockItem> INFUSED_CARAMEL_MAGMA_CREAM = ITEMS.register("infused_caramel_magma_cream",
            () -> new CaramelBlockItem(BlockInit.INFUSED_CARAMEL_MAGMA_CREAM.get(), new Item.Properties().tab(TinkersCaramel.TINKERS_CARAMEL_GROUP)
                    .food(new Food.Builder().fast().alwaysEat().nutrition(3).saturationMod(0.3F)
                            .effect(() -> new EffectInstance(Effects.FIRE_RESISTANCE, 20 * 30, 0), 1.0F).build())
                    .stacksTo(16)));
    //OG Caramel
    public static final RegistryObject<CaramelBlockItem> CARAMEL_BLOCK = ITEMS.register("caramel_block",
            () -> new CaramelBlockItem(BlockInit.CARAMEL_BLOCK.get(), new Item.Properties().tab(TinkersCaramel.TINKERS_CARAMEL_GROUP)
                    .food(new Food.Builder().fast().alwaysEat().nutrition(4).saturationMod(0.3F).build())));
    //block item
    public static final RegistryObject<BlockItem> SUGAR_GLASS = ITEMS.register("sugar_glass",
            () -> new BlockItem(BlockInit.SUGAR_GLASS.get(), new Item.Properties().tab(TinkersCaramel.TINKERS_CARAMEL_GROUP)));
    public static final RegistryObject<BlockItem> SUGAR_CLEAR_GLASS = ITEMS.register("sugar_clear_glass",
            () -> new BlockItem(BlockInit.SUGAR_CLEAR_GLASS.get(), new Item.Properties().tab(TinkersCaramel.TINKERS_CARAMEL_GROUP)));
    public static final RegistryObject<BlockItem> SUGAR_GLASS_PANE = ITEMS.register("sugar_glass_pane",
            () -> new BlockItem(BlockInit.SUGAR_GLASS_PANE.get(), new Item.Properties().tab(TinkersCaramel.TINKERS_CARAMEL_GROUP)));

    public static final RegistryObject<BlockItem> CARAMEL_CAKE = ITEMS.register("caramel_cake",
            () -> new BlockItem(BlockInit.CARAMEL_CAKE.get(), new Item.Properties().tab(TinkersCaramel.TINKERS_CARAMEL_GROUP).stacksTo(1)));

    public static final RegistryObject<BreadPileBlockItem> BREAD_NINE = ITEMS.register("bread_nine",
            () -> new BreadPileBlockItem(BlockInit.BREAD_NINE.get(), new Item.Properties().tab(TinkersCaramel.TINKERS_CARAMEL_GROUP)
                    .food(new Food.Builder().alwaysEat().nutrition(40).saturationMod(0.5F).build())
                    ));

    //possibly caramel block types?

    //bucket item

}
