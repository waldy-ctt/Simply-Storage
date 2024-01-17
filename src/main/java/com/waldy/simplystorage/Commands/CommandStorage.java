package com.waldy.simplystorage.Commands;

import com.waldy.simplystorage.Storages.Storage;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class CommandStorage implements CommandExecutor {
    Storage storage = new Storage();

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(sender instanceof Player){
            Player p = (Player) sender;

            storage.openStorage(p, storage.getInventory());
        }

        return true;
    }
}
