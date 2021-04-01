package top.jingbh.mcmods.gnfs_hair.item;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import top.jingbh.mcmods.gnfs_hair.util.CreatedCreativeTabs;
import top.jingbh.mcmods.gnfs_hair.util.I18n;

import javax.annotation.Nullable;
import java.util.List;

public class ItemHair extends Item {
    public ItemHair() {
        this.setCreativeTab(CreatedCreativeTabs.main);
        this.setUnlocalizedName("gnfshair.hair");
        this.setRegistryName(new ResourceLocation("gnfshair", "hair"));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add(I18n.get("item.gnfshair.hair.tooltip1"));
    }
}
