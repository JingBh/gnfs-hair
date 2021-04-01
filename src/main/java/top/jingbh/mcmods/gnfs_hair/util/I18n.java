package top.jingbh.mcmods.gnfs_hair.util;

import net.minecraft.util.text.TextComponentTranslation;

public class I18n {
    public static String get(String key) {
        return new TextComponentTranslation(key).getFormattedText();
    }
}
