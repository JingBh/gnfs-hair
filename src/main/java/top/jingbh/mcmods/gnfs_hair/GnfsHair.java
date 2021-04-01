package top.jingbh.mcmods.gnfs_hair;

import moze_intel.projecte.api.ProjectEAPI;
import moze_intel.projecte.api.proxy.IEMCProxy;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import top.jingbh.mcmods.gnfs_hair.util.CreatedItems;

@Mod(modid = GnfsHair.MODID, useMetadata = true)
public class GnfsHair
{
    public static final String MODID = "gnfshair";

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        if (Loader.isModLoaded("projecte")) {
            initEMC();
        }
    }

    private void initEMC() {
        IEMCProxy proxy = ProjectEAPI.getEMCProxy();
        proxy.registerCustomEMC(new ItemStack(CreatedItems.hair, 1), 512L);
    }
}
