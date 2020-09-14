package models;

import java.util.ArrayList;
import java.util.List;

public class Squad {
    private String squadName;
    private int maxSize;
    private String squadCause;
    private static List<Squad> squads = new ArrayList<>();// Will contain all Squad objects
    private int id;

    public Squad(String squadName, String squadCause) {
        this.squadName = squadName;
        this.maxSize = maxSize;
        this.squadCause = squadCause;
        squads.add(this);
        this.id = squads.size();
    }

    public String getSquadName() {
        return squadName;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public String getSquadCause() {
        return squadCause;
    }

    public static List<Squad> getAll(){
        return squads;
    }
    public static void clear() {
        squads.clear();
    }
    public int getId() {
        return id;
    }
    public static Squad findById(int id){
       return squads.get(id-1);
    }
}
