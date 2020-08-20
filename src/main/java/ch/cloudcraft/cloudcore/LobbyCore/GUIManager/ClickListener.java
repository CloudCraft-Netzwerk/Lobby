package ch.cloudcraft.cloudcore.LobbyCore.GUIManager;


import ch.cloudcraft.cloudcore.LobbyCore.Methods.BungeeWrapper;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.InventoryHolder;

public class ClickListener implements Listener {

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        Class<? extends InventoryHolder> holder = new GUIHolder().getClass();
        Class<? extends InventoryHolder> wantholder = event.getInventory().getHolder().getClass();

        // System.out.println("Click received, holder is "+event.getInventory().getHolder());
        // System.out.println(holder);
        // System.out.println(wantholder);

        if (wantholder.equals(holder)) {
            event.setCancelled(true);

            if (event.getSlot() == 13) {
                Player p = (Player) event.getWhoClicked();
                BungeeWrapper.sendPlayerTo(p, p.getName(), "lobby");
            }
        }

    }
}
