package top.jingbh.mcmods.gnfs_hair.proxy;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import top.jingbh.mcmods.gnfs_hair.GnfsHair;
import top.jingbh.mcmods.gnfs_hair.util.CreatedItems;
import top.jingbh.mcmods.gnfs_hair.util.IsGNF;

@EventBusSubscriber(modid = GnfsHair.MODID)
public class CommonProxy {
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();

        registry.register(CreatedItems.hair);
        registry.register(CreatedItems.hairBundle);
    }

    @SubscribeEvent
    public static void onLivingDeath(LivingDeathEvent event) {
        EntityLivingBase e = event.getEntityLiving();
        World world = e.getEntityWorld();
        if (world.isRemote) return;
        if (e instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) e;
            GnfsHair.getLogger().debug("Player death event fired by {}", player.getName());
            if (IsGNF.isPlayerGNF(player)) {
                BlockPos location = player.getPosition();
                EntityItem itemEntity = new EntityItem(world,
                        location.getX(), location.getY(), location.getZ(),
                        new ItemStack(CreatedItems.hair, 1));
                world.spawnEntity(itemEntity);
            }
        }
    }
}
