package Tests;

import java.util.*;
import game.*;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/* The ship and coordinate classes are tested in the same place because
* they are treated as complimentary data structures.
* */

public class ShipCoordinateTest {

    Coordinate testCoordinate;
    Ship testShip;
    AbstractBattleshipFactory factory;

    @Before
    public void createShipsAndCoords(){
        factory = new GameFactory();
        testShip = factory.CreateShip();
        testCoordinate = factory.CreateCoordinate(0,0);
    }


    @Test
    public void positionCoord(){
        assertEquals(0, testCoordinate.getX());
        assertEquals(0, testCoordinate.getY());

        assertEquals(0, testCoordinate.getTimesHit());
    }

    @Test
    public void hitCoord(){
        assertEquals(0, testCoordinate.getTimesHit());
        assertEquals(0, testCoordinate.getX());
        assertEquals(0, testCoordinate.getY());

        testCoordinate.Hit();

        assertEquals(1, testCoordinate.getTimesHit());
        assertEquals(0, testCoordinate.getX());
        assertEquals(0, testCoordinate.getY());
    }




}
