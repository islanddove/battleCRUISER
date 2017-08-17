package Tests;

import game.*;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BoardTest {

    Board board;
    AbstractBattleshipFactory factory;

    @Before
    public void createBoard(){
        factory = new GameFactory();
        board = factory.CreateBoard(10, 10);
    }

    @Test
    public void getCorrectCoordinate(){
        Coordinate coord = board.getCoordinateAtLocation(1,2);
        assertEquals(1, coord.getX());
        assertEquals(2, coord.getY());
    }


}
