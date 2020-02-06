import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquadTest {

    @Before
    public void setUp() throws Exception {
    }

    private Squad setupSquad() {
        return new Squad("legacy","bad guys");
    }
    private Hero setupNewHero() {
        return new Hero("Batman", 45, "Money", "Loneliness");
    }
    @Test
    public void NewSquadObjectGetsCorrectlyCreated_true() throws Exception {
        Squad squad = setupSquad();
        assertTrue( squad instanceof Squad);
    }
    @Test
    public void getSquadName_String(){
        Squad squad = setupSquad();
        assertEquals("legacy",squad.getSquadName());
    }
    @Test
    public void getSquadCause_String(){
        Squad squad = setupSquad();
        assertEquals("bad guys", squad.getCause());
    }

        @After
    public void tearDown() throws Exception {
    }
}