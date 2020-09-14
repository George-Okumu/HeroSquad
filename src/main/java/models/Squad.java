package models;

import java.util.ArrayList;
import java.util.List;

public class Squad {
    private String squadName;
    //private int maxSize;
    private String squadCause;
    private static ArrayList<Squad> allSquads = new ArrayList<>();// Will contain all Squad objects
    private int id;

    public Squad(String squadName, String squadCause) {
        this.squadName = squadName;
        //this.maxSize = maxSize;
        this.squadCause = squadCause;
        allSquads.add(this);
        this.id = allSquads.size();
    }

    public String getSquadName() {
        return squadName;
    }

//    public int getMaxSize() {
//        return maxSize;
//    }

    public String getSquadCause() {
        return squadCause;
    }

    public static ArrayList<Squad> getAllSquads() {
        return allSquads;
    }

    public int getId() {
        return id;
    }

    public static Squad findById(int id){
       return allSquads.get(id-1);
    }

}
