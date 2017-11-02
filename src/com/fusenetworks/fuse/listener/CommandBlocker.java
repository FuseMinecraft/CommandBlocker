package com.fusenetworks.fuse.listener;
 
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.EventHandler;

public class CommandBlocker implements Listener {
    @EventHandler
    public boolean PlayerCommandPreprocessEvent(PlayerCommandPreprocessEvent event) {
        if (!event.getPlayer().isOp())
        {
            event.getPlayer().sendMessage(ChatColor.RED + "Sorry, but no commands are allowed in this world.");
            event.setCancelled(true);
        }
    return true;
    }
}