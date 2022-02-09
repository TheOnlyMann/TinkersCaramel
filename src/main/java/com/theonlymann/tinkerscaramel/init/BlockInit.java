package com.theonlymann.tinkerscaramel.init;

import com.theonlymann.tinkerscaramel.TinkersCaramel;
import com.theonlymann.tinkerscaramel.block.CaramelBlock;
import com.theonlymann.tinkerscaramel.block.SugarGlassBlock;
import com.theonlymann.tinkerscaramel.block.SugarGlassPaneBlock;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.item.Item;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
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
            () -> new SugarGlassPaneBlock(AbstractBlock.Properties.of(Material.GLASS)
                    .strength(0.0f,0.0f)
                    .harvestLevel(-1)
                    .sound(SoundType.GLASS)
                    .instabreak()
                    .noOcclusion()
            ));

    //fluid blocks

}
