package com.lightning.extendedores;

import com.lightning.extendedores.init.ModBlocks;
import com.lightning.extendedores.init.ModItems;
import com.lightning.extendedores.utils.References;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(References.MODID)
public class ExtendedOres {

    public ExtendedOres() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModBlocks.register(bus);
        ModItems.register(bus);
        bus.addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(bus);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }
}
