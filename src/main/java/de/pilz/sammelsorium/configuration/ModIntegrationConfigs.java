package de.pilz.sammelsorium.configuration;

import com.gtnewhorizon.gtnhlib.config.Config;

import de.pilz.sammelsorium.PilzMcSammelsorium;

@Config(modid = PilzMcSammelsorium.MODID, category = "mod_integration")
public class ModIntegrationConfigs {

    @Config.Comment("If disabled, the most mod integrations will not work. Only disable, if you announce an error while that get fixed when off.")
    @Config.DefaultBoolean(true)
    @Config.RequiresMcRestart
    public static boolean searchForModBlocksAndItems;

    @Config.Comment("If enabled, a few known mod items and blocks get reigsted at the Ore Dictionary.\"searchForModBlocksAndItems\" needs to be true.")
    @Config.DefaultBoolean(true)
    @Config.RequiresMcRestart
    public static boolean registerModOres;

    @Config.Comment("Overwrites Forestrys method to get the players user profile and always return a offline UUID. Only enable this, if your server runs in offline mode.")
    @Config.DefaultBoolean(false)
    @Config.RequiresMcRestart
    public static boolean forestryMailFixOfflineUUDID;

    @Config.Comment("Allows to place lanterns of EFR everywhere.")
    @Config.DefaultBoolean(true)
    @Config.RequiresMcRestart
    public static boolean etfuturumPlaceBlockLanternAnywhere;
}
