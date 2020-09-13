package models;

import java.util.ArrayList;
import java.util.List;

public class Squad {
    private String squadName;
    private int maxSize;
    private String squadCause;
    private static List<Squad> instances = new ArrayList<>();// Will contain all Squad objects

    public Squad(String squadName, int maxSize, String squadCause) {
        this.squadName = squadName;
        this.maxSize = maxSize;
        this.squadCause = squadCause;
        instances.add(this);
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
    public static List<Squad> all(){
        return instances;
    }
}
