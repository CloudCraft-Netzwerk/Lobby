package ch.cloudcraft.cloudcore.LobbyCore;

import ch.cloudcraft.cloudcore.LobbyCore.GUIManager.ClickListener;
import ch.cloudcraft.cloudcore.LobbyCore.Listeners.Command;
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
        plugin = this;

        getServer().getPluginManager().registerEvents(new ClickListener(), this);
        getServer().getPluginManager().registerEvents(new Join(), this);
        getCommand("lobby").setExecutor(new Command());
        Bukkit.broadcastMessage("LobbyPRE "+System.currentTimeMillis());
        getServer().getPluginManager().registerEvents(new ClickListener(), this);
        this.getServer().getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");
        System.out.println("Plugin enabled, loading configs");
        saveDefaultConfig();
    }

    //Default onDisable Let me code
    @Override
    public void onDisable() {
        System.out.println("Plugin disabled");
    }

    //Default getPlugin()
    public static Plugin getPlugin() { return plugin; }
}
