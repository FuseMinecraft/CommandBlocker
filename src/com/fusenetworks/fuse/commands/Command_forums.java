package com.fusenetworks.fuse.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.ChatColor;

@CommandPermissions(source = SourceType.BOTH)
@CommandParameters(description = "Gives a link to the forums", usage = "/<command>", aliases = "forum,forums,fourm,fourms")
public class Command_forums extends BaseCommand {
    @Override
    public boolean run(final CommandSender sender, final Player sender_p, final Command cmd, final String commandLabel, final String[] args, final boolean senderIsConsole) 
    {
        String forums = plugin.getConfig().getString("server.forums");
        if (!forums.equalsIgnoreCase("none"))
        {
        sender.sendMessage(ChatColor.AQUA + "Forums: " + forums);
        } else {
            sender.sendMessage(ChatColor.RED + "There are no forums setup for this server");
        }
        return true;
    }
}
