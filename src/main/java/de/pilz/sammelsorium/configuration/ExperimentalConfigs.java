package de.pilz.sammelsorium.configuration;

import com.gtnewhorizon.gtnhlib.config.Config;

import de.pilz.sammelsorium.PilzMcSammelsorium;

@Config(modid = PilzMcSammelsorium.MODID, category = "experimental")
public class ExperimentalConfigs {

    @Config.Comment("Disables the option \"loadChunkOnProvideRequest\" on server to not load chunks whenever they are maybe requested. This is very experimental.")
    @Config.DefaultBoolean(false)
    public static boolean disableChunkLoadingOnRequest;

    @Config.Comment("When \"disableChunkLoadingOnRequest\" is true then this option helps that chunk load tickets continue to load the target chunk automatically. Otherwise such tickets are useless and chunkloaders too. You may want to disable this if your Chunkloader mod can that too (probably not).")
    @Config.DefaultBoolean(true)
    public static boolean autoLoadChunksOnTicketCreation;
}
