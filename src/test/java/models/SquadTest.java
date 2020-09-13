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
    public void SquadInstantiatesCorrectly() throws Exception {
        Squad squad = new Squad("Avengers", 10, "Save America");
        assertEquals(true, squad instanceof Squad);
    }

    @Test
    public void Squad_getsSquadNameCorrectly_string() throws Exception{
        Squad squad = new Squad("Avengers", 10, "Save America");
        assertEquals("Avengers", squad.getSquadName());
    }

    @Test
    public void Squad_getsMaxSizeCorrectly_int() throws Exception{
        Squad squad = new Squad("Avengers", 10, "Save America");
        assertEquals(10, squad.getMaxSize());
    }

    @Test
    public void Squad_getsSquadsNameCorrectly() throws Exception {
        Squad squad = new Squad("Avengers", 10, "Save America");
        assertEquals("Save America", squad.getSquadCause());
    }
}