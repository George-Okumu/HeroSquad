package models;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
}