package kbtdx.minecraft.man10CardGame;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class Man10CardGame extends JavaPlugin {

    public static JavaPlugin plugin;

    public static Map<Player,PlayerRecruitment> playerGameList;

    @Override
    public void onEnable() {
        plugin = this;
        plugin.getCommand("lastcard").setExecutor(new Commands());
        playerGameList = new HashMap<>();
    }

    @Override
    public void onDisable() {
    }
}
