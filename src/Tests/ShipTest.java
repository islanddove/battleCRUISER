package Tests;

import java.util.*;
import game.*;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ShipTest {

    @Test
    public void doNothing(){
        assertEquals("hi", "hi");
        assertFalse(false);
    }

    @Before
    public void createShips(){
        AbstractBattleshipFactory factory = new GameFactory();
        Ship testShip = factory.CreateShip();
    }

}
