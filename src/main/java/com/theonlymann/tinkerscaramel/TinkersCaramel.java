package com.theonlymann.tinkerscaramel;


import com.sun.jna.WString;
import com.theonlymann.tinkerscaramel.init.BlockInit;
import com.theonlymann.tinkerscaramel.init.ItemInit;
import com.theonlymann.tinkerscaramel.init.FluidInit;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("tinkerscaramel")
//@Mod.EventBusSubscriber(modid = TinkersCaramel.MOD_ID, bus= Mod.EventBusSubscriber.Bus.MOD)
public class TinkersCaramel
{
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "tinkerscaramel";
    public static final ItemGroup TINKERS_CARAMEL_GROUP = new TinkersCaramelGroup("tinkerscarameltab");
    public static Object TinkersCaramelGroup;

    public TinkersCaramel() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        FluidInit.FLUIDS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);

        bus.addListener(this::doClientStuff);
        //RenderTypeLookup.setRenderLayer(BlockInit.SUGAR_GLASS.get(), RenderType.cutout());

    }

    private void doClientStuff(final FMLClientSetupEvent event)
    {
        event.enqueueWork(() -> {
            RenderTypeLookup.setRenderLayer(BlockInit.SUGAR_GLASS.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(BlockInit.SUGAR_CLEAR_GLASS.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(BlockInit.SUGAR_GLASS_PANE.get(), RenderType.cutout());
        });

    }

    public static class TinkersCaramelGroup extends ItemGroup {
        public TinkersCaramelGroup(String label){
            super(label);
        }

        @Override
        public ItemStack makeIcon() {
            return ItemInit.CARAMEL_CRYSTAL.get().getDefaultInstance();
        }
    }


    /*@SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event){
        BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block ->{
            event.getRegistry().register(new BlockItem(block, new Item.Properties().tab(ItemGroup.TAB_MISC)).setRegistryName(block.getRegistryName()));
        });
    }*/
}