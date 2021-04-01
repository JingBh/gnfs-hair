package top.jingbh.mcmods.gnfs_hair.util;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import top.jingbh.mcmods.gnfs_hair.GnfsHair;

public class CreatedCreativeTabs {
    public static CreativeTabs main = new CreativeTabs(GnfsHair.MODID) {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(CreatedItems.hair);
        }
    };
}
