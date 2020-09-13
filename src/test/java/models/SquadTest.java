package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquadTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void SquadInstantiatesCorrectly() {
        Squad squad = new Squad();
        assertEquals(true, squad instanceof Squad);
    }

    @Test
    public void Squad_getsMaxSizeCorrectly_int() {
        Squad squad = new Squad();
        assertEquals(2, squad.getSquadMaxSize());
    }
}