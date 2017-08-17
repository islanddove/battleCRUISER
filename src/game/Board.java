package game;

public class Board {

    private Coordinate[][] coordGrid;

    public Board(int width, int height){
        coordGrid = new Coordinate[width][height];
        generateCoordinates();
    }

    private void generateCoordinates(){
        for(int i=0; i<coordGrid.length; i++){
            for(int j=0; j<coordGrid[i].length; j++){
                coordGrid[i][j] = new Coordinate(i, j);
            }
        }
    }

    public Coordinate getCoordinateAtLocation(int x, int y){
        return coordGrid[x][y];
    }
}
