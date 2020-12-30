package me.impurity.namecolour.commands;

import me.impurity.namecolour.NameColour;
import me.impurity.namecolour.utils.Data;
import me.impurity.namecolour.utils.Utils;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.List;

public class NameColorCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            String name = player.getDisplayName();
            if (args.length > 0) {
                switch (args[0]) {
                    case "red":
                        Utils.setName(player, "&c" + name + "&r");
                        sendNCMessage(sender, "&6You have set your NameColor to &c"  + args[0], args[0]);
                        break;
                    case "black":
                        Utils.setName(player, "&0" + name + "&r");
                        sendNCMessage(sender, "&6You have set your NameColor to &0"  + args[0], args[0]);
                        break;
                    case "dark-blue":
                        Utils.setName(player, "&1" + name + "&r");
                        sendNCMessage(sender, "&6You have set your NameColor to &1"  + args[0], args[0]);
                        break;
                    case "dark-green":
                        Utils.setName(player, "&2" + name + "&r");
                        sendNCMessage(sender, "&6You have set your NameColor to &2"  + args[0], args[0]);
                        break;
                    case "dark-aqua":
                        Utils.setName(player, "&3" + name + "&r");
                        sendNCMessage(sender, "&6You have set your NameColor to &3"  + args[0], args[0]);
                        break;
                    case "purple":
                        Utils.setName(player, "&5" + name + "&r");
                        sendNCMessage(sender, "&6You have set your NameColor to &5"  + args[0], args[0]);
                        break;
                    case "gold":
                        Utils.setName(player, "&6" + name + "&r");
                        sendNCMessage(sender, "&6You have set your NameColor to &6"  + args[0], args[0]);
                        break;
                    case "grey":
                        Utils.setName(player, "&7" + name + "&r");
                        sendNCMessage(sender, "&6You have set your NameColor to &7"  + args[0], args[0]);
                        break;
                    case "dark-grey":
                        Utils.setName(player, "&8" + name + "&r");
                        sendNCMessage(sender, "&6You have set your NameColor to &8"  + args[0], args[0]);
                        break;
                    case "blue":
                        Utils.setName(player, "&9" + name + "&r");
                        sendNCMessage(sender, "&6You have set your NameColor to &9"  + args[0], args[0]);
                        break;
                    case "green":
                        Utils.setName(player, "&a" + name + "&r");
                        sendNCMessage(sender, "&6You have set your NameColor to &a"  + args[0], args[0]);
                        break;
                    case "aqua":
                        Utils.setName(player, "&b" + name + "&r");
                        sendNCMessage(sender, "&6You have set your NameColor to &b"  + args[0], args[0]);
                        break;
                    case "light-purple":
                        Utils.setName(player, "&d" + name + "&r");
                        sendNCMessage(sender, "&6You have set your NameColor to &d"  + args[0], args[0]);
                        break;
                    case "yellow":
                        Utils.setName(player, "&e" + name + "&r");
                        sendNCMessage(sender, "&6You have set your NameColor to &e"  + args[0], args[0]);
                        break;
                    case "white":
                        Utils.setName(player, "&f" + name + "&r");
                        sendNCMessage(sender, "&6You have set your NameColor to &f"  + args[0], args[0]);
                        break;
                    case "bold":
                        String newName = "&l" + name;
                        Utils.setName(player, newName);
                        break;
                }
            }
        }
        return true;
    }
    private void sendNCMessage(CommandSender sender, String message, String color) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            Data.getData().set(player.getName(), color);
            Data.saveData();
            Utils.setUpColorMap();
            message = ChatColor.translateAlternateColorCodes('&', message);
            sender.sendMessage(message);
        }
    }
}
