package top.jingbh.mcmods.gnfs_hair;

import moze_intel.projecte.api.ProjectEAPI;
import moze_intel.projecte.api.proxy.IEMCProxy;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import top.jingbh.mcmods.gnfs_hair.util.CreatedItems;

@Mod(modid = GnfsHair.MODID, useMetadata = true)
public class GnfsHair
{
    public static final String MODID = "gnfshair";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        logger.info("Initializing...");
        if (Loader.isModLoaded("projecte")) {
            initEMC();
            logger.info("ProjectE detected, initializing EMC values...");
        }
    }

    private void initEMC() {
        IEMCProxy proxy = ProjectEAPI.getEMCProxy();
        proxy.registerCustomEMC(new ItemStack(CreatedItems.hair, 1), 512L);
    }

    public static Logger getLogger() {
        return logger;
    }
}
