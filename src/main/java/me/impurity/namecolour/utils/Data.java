package me.impurity.namecolour.utils;

import me.impurity.namecolour.NameColour;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

public class Data {
    private static FileConfiguration data;
    private static File dataFile;
    public static void makeData() {
        try {
            File dataFolder = NameColour.getInstance().getDataFolder();
            data = new YamlConfiguration();
            if (!dataFolder.exists()) dataFolder.mkdir();
            dataFile = new File(dataFolder, "data.yml");
            if (!dataFile.exists()) dataFile.createNewFile();
            loadData();
            saveData();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void loadData() {
        try {
           data.load(dataFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void saveData() {
        try {
            data.save(dataFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static FileConfiguration getData() {
        return data;
    }
}
