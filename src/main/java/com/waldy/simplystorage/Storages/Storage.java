package com.waldy.simplystorage.Storages;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Random;

public class Storage implements InventoryHolder {

    Random random = new Random();

    @Override
    public @NotNull Inventory getInventory() {
        Inventory inv = Bukkit.createInventory(this, 54, "Storage");
        loadItemMainStorageMenu(inv);

        return inv;
    }

    public void loadItemMainStorageMenu(Inventory inv){
        inv.setItem(0, createGUIItem(Material.BLACK_STAINED_GLASS_PANE, random.nextInt()," ", null));
        inv.setItem(1, createGUIItem(Material.BLACK_STAINED_GLASS_PANE, random.nextInt()," ", null));
        inv.setItem(2, createGUIItem(Material.BLACK_STAINED_GLASS_PANE, random.nextInt()," ", null));
        inv.setItem(3, createGUIItem(Material.BLACK_STAINED_GLASS_PANE, random.nextInt()," ", null));
        inv.setItem(4, createGUIItem(Material.ENDER_CHEST, random.nextInt(),ChatColor.GREEN + "Ender Chest",  ChatColor.RESET + "" + ChatColor.GRAY + "Store global items you can access anywhere in your ender chest."));
    }

    private ItemStack createGUIItem(final Material material, int ModelData , final String name, final String... description){
        final ItemStack item = new ItemStack(material, 1);
        final ItemMeta meta = item.getItemMeta();

        meta.setDisplayName(name);

        if (description == null) {
            meta.setLore(null);
        } else {
            meta.setLore(Arrays.asList(description));
        }

        meta.setCustomModelData(ModelData);

        item.setItemMeta(meta);

        return item;
    }

    public void openStorage(Player player, Inventory inv){
        player.openInventory(inv);
    }

    public void onInventoryClick(InventoryClickEvent e){
        e.setCancelled(true);


    }
}
