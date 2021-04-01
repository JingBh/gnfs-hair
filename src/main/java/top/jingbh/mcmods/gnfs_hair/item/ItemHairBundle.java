package top.jingbh.mcmods.gnfs_hair.item;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import top.jingbh.mcmods.gnfs_hair.util.CreatedCreativeTabs;

public class ItemHairBundle extends Item {
    public ItemHairBundle() {
        this.setCreativeTab(CreatedCreativeTabs.main);
        this.setUnlocalizedName("gnfshair.hair_bundle");
        this.setRegistryName(new ResourceLocation("gnfshair", "hair_bundle"));
    }
}
