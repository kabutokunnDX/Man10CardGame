package kbtdx.minecraft.man10CardGame;

import org.bukkit.plugin.java.JavaPlugin;

public final class Man10CardGame extends JavaPlugin {

    public static JavaPlugin plugin;

    @Override
    public void onEnable() {
        plugin = this;
        plugin.getCommand("lastcard").setExecutor(new Commands());
    }

    @Override
    public void onDisable() {
    }
}
