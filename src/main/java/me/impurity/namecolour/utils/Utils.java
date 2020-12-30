package me.impurity.namecolour.utils;

import me.impurity.namecolour.NameColour;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import java.util.HashMap;

public class Utils {
    public static String getPrefix() {
        return ChatColor.translateAlternateColorCodes('&', "[&bImpurityNC&r]");
    }
    public static void setName(Player player, String name) {
        name = ChatColor.translateAlternateColorCodes('&', name);
        player.setDisplayName(name);
    }
     public static void setUpColorMap() {
        FileConfiguration data = Data.getData();
         HashMap<String, String> colorMap = NameColour.getInstance().getColorMap();
        data.getKeys(true).forEach(name -> colorMap.putIfAbsent(name, data.getString(name).toUpperCase()));
    }
}
