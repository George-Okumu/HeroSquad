package models;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class HeroTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void newHeroInstantiatesCorrectly() {
        Hero hero = new Hero("hulk", 32, "strength", "anger");
        Assert.assertTrue(true);
    }

    @Test
    public void Hero_instantiatesCorrectlyWithHeroName_string () throws Exception{
        Hero hero = new Hero("hulk",34,"Strength", "anger");
        assertEquals("hulk",hero.getName());
    }

    @Test
    public void Hero_getsHeroAgeCorrectly_int() throws  Exception {
        Hero hero = new Hero("hulk",34,"Strength", "anger");
        assertEquals(34,hero.getAge());
    }

    @Test
    public void Hero_instantiatesCorrectlyWithHeroesSpecialPower_string() throws Exception {
        Hero hero = new Hero("hulk",34,"Strength", "anger");
        assertEquals("Strength", hero.getSpecialPower());
    }

    @Test
    public void Hero_instantiatesCorrectlyWithHeroWeakness_string() throws Exception{
        Hero hero = new Hero("hulk",34,"Strength", "anger");
        assertEquals("anger", hero.getWeakness());
    }

    @Test
    public void all_returnsAllInstancesOfHero_true() {
        Hero firstHero = new Hero("hulk",34,"Strength", "anger");
        Hero secondHero = new Hero("hulk",34,"Strength", "anger");
        assertEquals(true, Hero.getAll().contains(firstHero));
        assertEquals(true, Hero.getAll().contains(secondHero));
    }
    @Test
    public void getCreatedAt_instantiatesWithCurrentTime_today() throws Exception{
        Hero hero = new Hero("hulk",34,"Strength", "anger");
        assertEquals(LocalDateTime.now().getDayOfWeek(), hero.getCreatedAt().getDayOfWeek());
    }
    @Test
    public void clear_emptiesAllHeroesFromArrayList_0() {
        Hero firstHero = new Hero("hulk",34,"Strength", "anger");
        Hero.clear();
        assertEquals(Hero.getAll().size(), 0);
    }
}