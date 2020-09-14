package models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Hero {
    private String name;
    //private int age;
    private String specialPower;
    private String weakness;
    private static ArrayList<Hero> allHeroes = new ArrayList<>();
    private LocalDateTime createdAt;

    public Hero(String name,String specialPower, String weakness) {
        this.name = name;
        //this.age = age;
        this.specialPower = specialPower;
        this.weakness = weakness;
        this.createdAt = LocalDateTime.now();
        allHeroes.add(this);
    }

    public String getName() {
        return name;
    }

//    public int getAge() {
//        return age;
//    }


    public static ArrayList<Hero> getAllHeroes() {
        return allHeroes;
    }

    public String getSpecialPower() {
        return specialPower;
    }

    public String getWeakness() {
        return weakness;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public static void clear(){
        allHeroes.clear(); //clear as a method is part of the ArrayList class.
    }
}
