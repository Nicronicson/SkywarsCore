package SkywarsCore;

import java.util.Arrays;

public enum Rarity {
    COMMON("Common", 0),
    UNCOMMON("Uncommon", 1),
    EPIC("Epic", 2),
    LEGENDARY("Legendary", 3);

    private final String value;
    private final int id;

    Rarity(String value, int id){
        this.value = value;
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public int getId() {
        return id;
    }

    public static Rarity getById(int id){
        return Arrays.stream(Rarity.values()).filter(rarity -> rarity.id == id).findFirst().orElse(null);
    }
}