package top.jingbh.mcmods.gnfs_hair.proxy;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import top.jingbh.mcmods.gnfs_hair.GnfsHair;
import top.jingbh.mcmods.gnfs_hair.util.CreatedItems;

@EventBusSubscriber(modid = GnfsHair.MODID)
public class CommonProxy {
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();

        registry.register(CreatedItems.hair);
        registry.register(CreatedItems.hairBundle);
    }
}
