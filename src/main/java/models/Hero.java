package models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Hero {
    private String name;
    private int age;
    private String specialPower;
    private String weakness;
    private static List<Hero> heroes = new ArrayList<>();
    private LocalDateTime createdAt;

    public Hero(String name, int age,String specialPower, String weakness) {
        this.name = name;
        this.age = age;
        this.specialPower = specialPower;
        this.weakness = weakness;
        this.createdAt = LocalDateTime.now();
        heroes.add(this);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static List<Hero> getAll() {
        return heroes;
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
        heroes.clear(); //clear as a method is part of the ArrayList class.
    }
}
