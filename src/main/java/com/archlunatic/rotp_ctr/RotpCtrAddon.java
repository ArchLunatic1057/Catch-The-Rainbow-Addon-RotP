package com.archlunatic.rotp_ctr;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.archlunatic.rotp_ctr.init.InitEntities;
import com.archlunatic.rotp_ctr.init.InitSounds;
import com.archlunatic.rotp_ctr.init.InitStands;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(RotpCtrAddon.MOD_ID)
public class RotpCtrAddon {
    // The value here should match an entry in the META-INF/mods.toml file
    public static final String MOD_ID = "rotp_ctr";
    private static final Logger LOGGER = LogManager.getLogger();

    public RotpCtrAddon() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        InitEntities.ENTITIES.register(modEventBus);
        InitSounds.SOUNDS.register(modEventBus);
        InitStands.ACTIONS.register(modEventBus);
        InitStands.STANDS.register(modEventBus);
    }

    public static Logger getLogger() {
        return LOGGER;
    }
}
