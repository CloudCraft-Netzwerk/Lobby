package ch.cloudcraft.cloudcore.LobbyCore;

import ch.cloudcraft.cloudcore.LobbyCore.GUIManager.ClickListener;
import ch.cloudcraft.cloudcore.LobbyCore.Listeners.Join;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    // Plugin default shit
    static Plugin plugin;


    // Default onEnable
    @Override
    public void onEnable() {
        this.plugin = this;

        getServer().getPluginManager().registerEvents(new ClickListener(), this);
        getServer().getPluginManager().registerEvents(new Join(), this);
        Bukkit.broadcastMessage("LobbyPRE "+System.currentTimeMillis());
        System.out.println("Plugin enabled");
    }

    //Default onDisable
    @Override
    public void onDisable() {
        System.out.println("Plugin disabled");
    }

    //Default getPlugin()
    public static Plugin getPlugin() { return plugin; }
}
