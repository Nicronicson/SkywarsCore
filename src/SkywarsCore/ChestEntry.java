package SkywarsCore;

import org.bukkit.inventory.ItemStack;

import java.util.Map;

public class ChestEntry {
    protected ItemStack item;
    protected Map<String, Integer> itemENC;

    protected int chance;
    protected int middleChance;

    public ChestEntry() {
    }

    public void setAll(ItemStack item, Map<String, Integer> itemENC, int chance, int middleChance){
        this.item = item;
        this.itemENC = itemENC;
        this.chance = chance;
        this.middleChance = middleChance;
    }

    public ItemStack getItem() {
        return item;
    }

    public void setItem(ItemStack item) {
        this.item = item;
    }

    public Map<String, Integer> getItemENC() {
        return itemENC;
    }

    public void setItemENC(Map<String, Integer> itemENC) {
        this.itemENC = itemENC;
    }

    public int getChance() {
        return chance;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }

    public int getMiddleChance() {
        return middleChance;
    }

    public void setMiddleChance(int middleChance) {
        this.middleChance = middleChance;
    }
}
