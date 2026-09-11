package com.ultimatelife;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

@Mod(UltimateLife.MOD_ID)
public class UltimateLife {
    public static final String MOD_ID = "ultimatelife";
    private static final Logger LOGGER = LogUtils.getLogger();

    public UltimateLife() {
        LOGGER.info("Ultimate Life mod loading!");
    }
}
