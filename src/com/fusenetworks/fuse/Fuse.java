package com.fusenetworks.fuse;

import com.fusenetworks.fuse.listener.CommandBlocker;
import org.bukkit.Server;
import org.bukkit.plugin.java.JavaPlugin;

public class Fuse extends JavaPlugin {

    public static Fuse plugin;
    public static Server server;
    public static Fuse instance;

    @Override
    public void onLoad() {
        Fuse.plugin = this;
        Fuse.server = plugin.getServer();
    }

    @Override
    public void onEnable() {
        server.getPluginManager().registerEvents(new CommandBlocker(), Fuse.plugin);
        instance = this;
    }

    @Override
    public void onDisable() {

    }
}