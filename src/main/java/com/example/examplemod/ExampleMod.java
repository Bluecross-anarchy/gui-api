package com.example.examplemod;

import idk.bluecross.uiapi.Renderer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = ExampleMod.MODID, name = ExampleMod.NAME, version = ExampleMod.VERSION)
public class ExampleMod {
    public static final String MODID = "examplemod";
    public static final String NAME = "Example Mod";
    public static final String VERSION = "1.0";

    public static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog( );
        Client.startup( );
        logger.info("Name changed");
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info("Client initialized");

        MinecraftForge.EVENT_BUS.register(new SomeGui( ));
        MinecraftForge.EVENT_BUS.register(new Renderer( ));


    }
}
