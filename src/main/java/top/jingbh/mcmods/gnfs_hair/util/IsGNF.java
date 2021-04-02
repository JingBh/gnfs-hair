package top.jingbh.mcmods.gnfs_hair.util;

import net.minecraft.entity.player.EntityPlayer;

import java.util.Arrays;
import java.util.List;

public class IsGNF {
    private static final List<String> names = Arrays.asList("GongKnife", "GNF");

    public static boolean isPlayerGNF(EntityPlayer player) {
        return isNameGNF(player.getName());
    }

    public static boolean isNameGNF(String name) {
        return names.contains(name);
    }
}
