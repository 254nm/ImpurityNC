package me.impurity.namecolour;

import me.impurity.namecolour.commands.NameColorCommand;
import me.impurity.namecolour.listeners.PlayerJoin;
import me.impurity.namecolour.utils.Data;
import me.impurity.namecolour.utils.Utils;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

public final class NameColour extends JavaPlugin {
    PluginManager pluginManager = getServer().getPluginManager();
    HashMap<String, String> colorMap = new HashMap<>();
    private static NameColour instance;
    @Override
    public void onEnable() {
        if (instance == null) instance = this;
        getCommand("namecolor").setExecutor(new NameColorCommand());
        Data.makeData();
        Utils.setUpColorMap();
        pluginManager.registerEvents(new PlayerJoin(), this);
    }
    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static NameColour getInstance() {
        return instance;
    }

    public HashMap<String, String> getColorMap() {
        return colorMap;
    }
}
