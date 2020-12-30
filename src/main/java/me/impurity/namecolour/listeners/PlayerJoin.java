package me.impurity.namecolour.listeners;

import me.impurity.namecolour.NameColour;
import me.impurity.namecolour.utils.Utils;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.HashMap;

public class PlayerJoin implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        HashMap<String, String> colorMap = NameColour.getInstance().getColorMap();
        Utils.setUpColorMap();
        if (colorMap.containsKey(player.getName())) {
            ChatColor color = ChatColor.valueOf(colorMap.get(player.getName()));
            String newName = color + player.getName() + "&r";
            Utils.setName(player, newName);
        }
    }
}
