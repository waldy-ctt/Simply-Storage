package com.waldy.simplystorage;

import com.waldy.simplystorage.Commands.CommandStorage;
import com.waldy.simplystorage.EventListener.EventListener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class SimplyStorage extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("SimplyStorage plugin enabled");
        getLogger().log(Level.CONFIG, "debug message");
        getServer().getPluginManager().registerEvents(new EventListener(), this);
        this.getCommand("storage").setExecutor(new CommandStorage());
    }

    @Override
    public void onDisable() {
        getLogger().info("SimplyStorage plugin disabled");
    }
}
