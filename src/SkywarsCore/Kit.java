package SkywarsCore;

import org.bukkit.inventory.ItemStack;
import java.util.ArrayList;
import java.util.Map;

public class Kit {
    protected String name;
    protected ItemStack visual;

    protected ItemStack leftHand;
    protected Map<String, Integer> leftHandENC;

    protected ItemStack helmet;
    protected Map<String, Integer> helmetENC;
    protected ItemStack chestplate;
    protected Map<String, Integer> chestplateENC;
    protected ItemStack leggings;
    protected Map<String, Integer> leggingsENC;
    protected ItemStack boots;
    protected Map<String, Integer> bootsENC;

    protected ItemStack[] inventory;
    protected ArrayList<Map<String, Integer>> inventoryENC;

    public Kit(String name, ItemStack leftHand, Map<String, Integer> leftHandENC, ItemStack helmet, Map<String, Integer> helmetENC, ItemStack chestplate, Map<String, Integer> chestplateENC, ItemStack leggings, Map<String, Integer> leggingsENC, ItemStack boots, Map<String, Integer> bootsENC, ItemStack[] inventory, ArrayList<Map<String, Integer>> inventoryENC, ItemStack visual) {
        this.name = name;
        this.leftHand = leftHand;
        this.leftHandENC = leftHandENC;
        this.helmet = helmet;
        this.helmetENC = helmetENC;
        this.chestplate = chestplate;
        this.chestplateENC = chestplateENC;
        this.leggings = leggings;
        this.leggingsENC = leggingsENC;
        this.boots = boots;
        this.bootsENC = bootsENC;
        this.inventory = inventory;
        this.inventoryENC = inventoryENC;
        this.visual = visual;
    }

    public Kit(){

    }

    public ItemStack getLeftHand() {
        return leftHand;
    }

    public void setLeftHand(ItemStack leftHand) {
        this.leftHand = leftHand;
    }

    public Map<String, Integer> getLeftHandENC() {
        return leftHandENC;
    }

    public void setLeftHandENC(Map<String, Integer> leftHandENC) {
        this.leftHandENC = leftHandENC;
    }

    public ItemStack getHelmet() {
        return helmet;
    }

    public void setHelmet(ItemStack helmet) {
        this.helmet = helmet;
    }

    public Map<String, Integer> getHelmetENC() {
        return helmetENC;
    }

    public void setHelmetENC(Map<String, Integer> helmetENC) {
        this.helmetENC = helmetENC;
    }

    public ItemStack getChestplate() {
        return chestplate;
    }

    public void setChestplate(ItemStack chestplate) {
        this.chestplate = chestplate;
    }

    public Map<String, Integer> getChestplateENC() {
        return chestplateENC;
    }

    public void setChestplateENC(Map<String, Integer> chestplateENC) {
        this.chestplateENC = chestplateENC;
    }

    public ItemStack getLeggings() {
        return leggings;
    }

    public void setLeggings(ItemStack leggings) {
        this.leggings = leggings;
    }

    public Map<String, Integer> getLeggingsENC() {
        return leggingsENC;
    }

    public void setLeggingsENC(Map<String, Integer> leggingsENC) {
        this.leggingsENC = leggingsENC;
    }

    public ItemStack getBoots() {
        return boots;
    }

    public void setBoots(ItemStack boots) {
        this.boots = boots;
    }

    public Map<String, Integer> getBootsENC() {
        return bootsENC;
    }

    public void setBootsENC(Map<String, Integer> bootsENC) {
        this.bootsENC = bootsENC;
    }

    public ItemStack[] getInventory() {
        return inventory;
    }

    public void setInventory(ItemStack[] inventory) {
        this.inventory = inventory;
    }

    public ArrayList<Map<String, Integer>> getInventoryENC() {
        return inventoryENC;
    }

    public void setInventoryENC(ArrayList<Map<String, Integer>> inventoryENC) {
        this.inventoryENC = inventoryENC;
    }

    public ItemStack getVisual() {
        return visual;
    }

    public void setVisual(ItemStack visual) {
        this.visual = visual;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
