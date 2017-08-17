package game;

public class GameFactory implements AbstractBattleshipFactory{

    @Override
    public Ship CreateShip() {
        return new Ship();
    }

    @Override
    public Player CreatePlayer() {
        return new Player();
    }

    @Override
    public Board CreateBoard(int width, int height) {
        return new Board(width, height);
    }

    @Override
    public Coordinate CreateCoordinate(int x, int y){
        return new Coordinate(x,y);
    }

}
