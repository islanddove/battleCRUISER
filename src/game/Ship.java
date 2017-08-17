package game;

import java.util.List;
import java.util.ArrayList;


/* A ship is treated as a collection of coordinates, nothing more*/
public class Ship {

    private List<Coordinate> coordinates = new ArrayList <>();

    public int shipSize(){
        return coordinates.size();
    }

    public void addCoordinate(Coordinate coord){
        coordinates.add(coord);
    }

    public boolean shipIsSunk(){
        for (Coordinate c  :  coordinates){
            if(c.getTimesHit() == 0){
                return false;
            }
        }
        return true;
    }
}
