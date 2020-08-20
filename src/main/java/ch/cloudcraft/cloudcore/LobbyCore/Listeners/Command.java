package ch.cloudcraft.cloudcore.LobbyCore.Listeners;

import ch.cloudcraft.cloudcore.LobbyCore.Methods.Methods;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import sun.audio.AudioSecurityAction;

import java.awt.*;


public class Command implements CommandExecutor {
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command command, String s, String[] args) {

        if (sender instanceof ConsoleCommandSender) {
            sender.sendMessage("Dieser Befehl kann nur als Spieler verwendet werden.");
            return false;

        }

        Player p = (Player) sender;
        String pfx = Methods.getPrefix();
        if (args.length == 0) {
            Methods.sendMessage(p, "Benutzung: Blablabla");
        } else {
            Methods.sendMessage(p, "Check reached");

        }




        return true;
    }
}
