package SkywarsCore;

import org.bukkit.Location;
import java.util.ArrayList;
import java.util.List;

public class Map {
    protected String mapname;
    protected int teamsize;
    protected Location middle;
    protected Location pos1;
    protected Location pos2;

    protected List<Location> spawnpoints;
    protected List<Location> chests;
    protected List<Location> middleChests;

    public Map(String mapname){
        this.mapname = mapname;
        teamsize = 0;
        this.middle = null;
        this.pos1 = null;
        this.pos2 = null;
        this.spawnpoints = new ArrayList<>();
        this.chests = new ArrayList<>();
        this.middleChests = new ArrayList<>();
    }

    public int getTeamsize() {
        return teamsize;
    }

    public void setTeamsize(int teamsize) {
        this.teamsize = teamsize;
    }

    public void setMapname(String mapname) {
        this.mapname = mapname;
    }

    public void setSpawnpoints(List<Location> spawnpoints) {
        this.spawnpoints = spawnpoints;
    }

    public String getMapname(){
        return mapname;
    }

    public List<Location> getSpawnpoints() {
        return spawnpoints;
    }

    public List<Location> getChests() {
        return chests;
    }

    public List<Location> getMiddleChests() {
        return middleChests;
    }

    public Location getMiddle() {
        return middle;
    }

    public void setMiddle(Location middle) {
        this.middle = middle;
    }

    public void setPos1(Location pos1) {
        this.pos1 = pos1;
    }

    public Location getPos1(){
        return pos1;
    }

    public void setPos2(Location pos2) {
        this.pos2 = pos2;
    }

    public Location getPos2(){
        return pos2;
    }

    public void addSpawnpoint(Location spawnpoint){
        spawnpoints.add(spawnpoint);
    }

    public void resetSpawnpoints(){
        spawnpoints.clear();
    }

    public void setChests(List<Location> chests){
        this.chests = chests;
    }

    public void setMiddleChests(List<Location> middleChests){
        this.middleChests = middleChests;
    }

    public boolean positionsAvailable(){
        if(pos1 == null || pos2 == null){
            return false;
        } else {
            return true;
        }
    }
}
