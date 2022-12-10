package com.oott123.rechars;

//import net.fabricmc.api.ModInitializer;
import net.minecraftforge.fml.IExtensionPoint;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.network.NetworkConstants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(ReChars.MODID)
public class ReChars {
    public static final String MODID = "rechars";
    public static final Logger LOGGER = LogManager.getLogger("RoughlyEnoughCharacters");

    public ReChars() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onInitialize);

        ModLoadingContext.get().registerExtensionPoint(IExtensionPoint.DisplayTest.class, () -> new IExtensionPoint.DisplayTest(() -> NetworkConstants.IGNORESERVERONLY, (a, b) -> true));

    }

    //@Override
    public void onInitialize(final FMLCommonSetupEvent event) {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        LOGGER.info("Thanks for using RoughlyEnoughCharacters-Forge!");
    }
}
