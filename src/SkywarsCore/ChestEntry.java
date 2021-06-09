package SkywarsCore;

import org.bukkit.inventory.ItemStack;

import java.util.Map;

public class ChestEntry {
    protected ItemStack item;
    protected Map<String, Integer> itemENC;
    protected Rarity rarity;

    public ChestEntry(ItemStack item, Map<String, Integer> itemENC, Rarity rarity) {
        this.item = item;
        this.itemENC = itemENC;
        this.rarity = rarity;
    }

    public ItemStack getItem() {
        return item;
    }

    /*public void setItem(ItemStack item) {
        this.item = item;
    }

     */

    public Map<String, Integer> getItemENC() {
        return itemENC;
    }

    /*public void setItemENC(Map<String, Integer> itemENC) {
        this.itemENC = itemENC;
    }

     */

    public Rarity getRarity() {
        return rarity;
    }
}
