package top.jingbh.mcmods.gnfs_hair.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import top.jingbh.mcmods.gnfs_hair.GnfsHair;
import top.jingbh.mcmods.gnfs_hair.util.CreatedItems;

@EventBusSubscriber(value = Side.CLIENT, modid = GnfsHair.MODID)
public class ClientProxy {
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        registerItem(CreatedItems.hair);
        registerItem(CreatedItems.hairBundle);
    }

    private static void registerItem(Item item) {
        ResourceLocation nameObj = item.getRegistryName();
        String name = nameObj == null ? "" : nameObj.toString();
        ModelResourceLocation model = new ModelResourceLocation(name, "inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0, model);
    }
}
