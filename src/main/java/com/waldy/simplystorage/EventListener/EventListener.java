package com.waldy.simplystorage.EventListener;

import com.waldy.simplystorage.Storages.Storage;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class EventListener implements Listener {
    Storage storage = new Storage();
    @EventHandler
    public void onPlayerClickInInventory(InventoryClickEvent event){
        if(!(event.getInventory().getHolder() instanceof Storage)) return;

        storage.onInventoryClick(event);

    }
}
