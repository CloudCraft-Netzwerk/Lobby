package ch.cloudcraft.cloudcore.LobbyCore.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class Join implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        event.setJoinMessage("§a» §b§lDer Spieler §9§l"+event.getPlayer().getName()+"§b§l ist beigetreten.");
    }

    @EventHandler
    public void onLeave(PlayerQuitEvent event) {
        event.setQuitMessage("§c« §b§lDer Spieler §9§l"+event.getPlayer().getName()+"§b§l hat den Server verlassen.");
    }
}
