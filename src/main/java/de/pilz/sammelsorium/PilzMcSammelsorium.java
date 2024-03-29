package de.pilz.sammelsorium;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import de.pilz.sammelsorium.proxies.CommonProxy;

@Mod(
    modid = PilzMcSammelsorium.MODID,
    version = Tags.VERSION,
    name = PilzMcSammelsorium.MODNAME,
    acceptedMinecraftVersions = "[1.7.10]",
    guiFactory = "de.pilz.sammelsorium.configuration.gui.PilzMcSammelsoriumGuiConfigFactory")
public class PilzMcSammelsorium {

    public static final String MODNAME = "Pilz' Sammelsorium";
    public static final String MODID = "pilzmcsammelsorium";
    public static final String GROUPNAME = "de.pilz.sammelsorium";
    public static final Logger LOG = LogManager.getLogger(MODID);

    @Instance(MODID)
    public static PilzMcSammelsorium instance;

    @SidedProxy(
        clientSide = "de.pilz.sammelsorium.proxies.ClientProxy",
        serverSide = "de.pilz.sammelsorium.proxies.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    // preInit "Run before anything else. Read your config, create blocks, items, etc, and register them with the
    // GameRegistry." (Remove if not needed)
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    // load "Do your mod setup. Build whatever data structures you care about. Register recipes." (Remove if not needed)
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    // postInit "Handle interaction with other mods, complete your setup based on this." (Remove if not needed)
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    @Mod.EventHandler
    // register server commands in this event handler (Remove if not needed)
    public void serverStarting(FMLServerStartingEvent event) {
        proxy.serverStarting(event);
    }
}
