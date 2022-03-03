package com.theonlymann.tinkerscaramel.init;

import com.theonlymann.tinkerscaramel.TinkersCaramel;
import com.theonlymann.tinkerscaramel.block.CaramelBlock;
import com.theonlymann.tinkerscaramel.block.CaramelCakeBlock;
import com.theonlymann.tinkerscaramel.block.SugarGlassBlock;
import com.theonlymann.tinkerscaramel.block.SugarGlassPaneBlock;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import slimeknights.mantle.item.BlockTooltipItem;
import slimeknights.mantle.registration.object.ItemObject;
import slimeknights.tconstruct.gadgets.block.FoodCakeBlock;
import slimeknights.tconstruct.shared.TinkerFood;
import slimeknights.tconstruct.world.block.CongealedSlimeBlock;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            TinkersCaramel.MOD_ID);

    public static final RegistryObject<CaramelBlock> CARAMEL_BLOCK = BLOCKS.register("caramel_block",
            () -> new CaramelBlock(AbstractBlock.Properties.of(Material.SNOW, MaterialColor.COLOR_ORANGE)
                    .strength(0.3f,0.5f)
                    .harvestTool(ToolType.HOE).harvestLevel(-1)
                    .sound(SoundType.HONEY_BLOCK)
                    .jumpFactor(0.8F)));

    public static final RegistryObject<SugarGlassBlock> SUGAR_GLASS = BLOCKS.register("sugar_glass",
            () -> new SugarGlassBlock(AbstractBlock.Properties.of(Material.GLASS)
                    .strength(0.5f,1.0f)
                    .harvestLevel(-1)
                    .sound(SoundType.GLASS)
                    .noOcclusion()
                    //.instabreak()
            ));
    public static final RegistryObject<SugarGlassBlock> SUGAR_CLEAR_GLASS = BLOCKS.register("sugar_clear_glass",
            () -> new SugarGlassBlock(AbstractBlock.Properties.of(Material.GLASS)
                    .strength(0.5f,1.0f)
                    .harvestLevel(-1)
                    .sound(SoundType.GLASS)
                    .noOcclusion()
                    //.instabreak()
            ));

    public static final RegistryObject<SugarGlassPaneBlock> SUGAR_GLASS_PANE = BLOCKS.register("sugar_glass_pane",
            () -> new SugarGlassPaneBlock(AbstractBlock.Properties.of(Material.BAMBOO_SAPLING)
                    .strength(0.0f,0.0f)
                    .harvestLevel(-1)
                    .sound(SoundType.GLASS)
                    .instabreak()
                    .noOcclusion()
            ));

    //Infused Caramels
    public static final RegistryObject<CaramelBlock> INFUSED_CARAMEL_EARTHSLIME = BLOCKS.register("infused_caramel_earthslime",
            () -> new CaramelBlock(AbstractBlock.Properties.of(Material.SNOW)
                    .strength(0.3f,0.5f)
                    .harvestTool(ToolType.HOE).harvestLevel(-1)
                    .sound(SoundType.HONEY_BLOCK)
                    .jumpFactor(0.8F)));
    public static final RegistryObject<CaramelBlock> INFUSED_CARAMEL_SKYSLIME = BLOCKS.register("infused_caramel_skyslime",
            () -> new CaramelBlock(AbstractBlock.Properties.of(Material.SNOW)
                    .strength(0.3f,0.5f)
                    .harvestTool(ToolType.HOE).harvestLevel(-1)
                    .sound(SoundType.HONEY_BLOCK)
                    .jumpFactor(0.8F)));
    public static final RegistryObject<CaramelBlock> INFUSED_CARAMEL_BLOOD = BLOCKS.register("infused_caramel_blood",
            () -> new CaramelBlock(AbstractBlock.Properties.of(Material.SNOW)
                    .strength(0.3f,0.5f)
                    .harvestTool(ToolType.HOE).harvestLevel(-1)
                    .sound(SoundType.HONEY_BLOCK)
                    .jumpFactor(0.8F)));
    public static final RegistryObject<CaramelBlock> INFUSED_CARAMEL_ICHOR = BLOCKS.register("infused_caramel_ichor",
            () -> new CaramelBlock(AbstractBlock.Properties.of(Material.SNOW)
                    .strength(0.3f,0.5f)
                    .harvestTool(ToolType.HOE).harvestLevel(-1)
                    .sound(SoundType.HONEY_BLOCK)
                    .jumpFactor(0.8F)));
    public static final RegistryObject<CaramelBlock> INFUSED_CARAMEL_ENDERSLIME = BLOCKS.register("infused_caramel_enderslime",
            () -> new CaramelBlock(AbstractBlock.Properties.of(Material.SNOW)
                    .strength(0.3f,0.5f)
                    .harvestTool(ToolType.HOE).harvestLevel(-1)
                    .sound(SoundType.HONEY_BLOCK)
                    .jumpFactor(0.8F)));
    public static final RegistryObject<CaramelBlock> INFUSED_CARAMEL_MAGMA_CREAM = BLOCKS.register("infused_caramel_magma_cream",
            () -> new CaramelBlock(AbstractBlock.Properties.of(Material.SNOW)
                    .strength(0.3f,0.5f)
                    .harvestTool(ToolType.HOE).harvestLevel(-1)
                    .sound(SoundType.HONEY_BLOCK)
                    .jumpFactor(0.8F)));

    //Cake?
    public static final RegistryObject<CaramelCakeBlock> CARAMEL_CAKE = BLOCKS.register("caramel_cake",
            () -> new CaramelCakeBlock(AbstractBlock.Properties.of(Material.CAKE)
                    .strength(0.5F).sound(SoundType.WOOL)));

}
