package ch.cloudcraft.cloudcore.LobbyCore.Methods;

import ch.cloudcraft.cloudcore.LobbyCore.Main;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class Methods {


    public static void sendMessage(Player p, String message) {
        p.sendMessage(getPrefix()+message);
    }

    public static String getPrefix() {
        return "§9§l[§b§lCloudCraft-LobbyPRESET§9§l]§r§b ";

    }

}
