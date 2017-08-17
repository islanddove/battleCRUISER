package game;

public interface AbstractBattleshipFactory {
    Ship CreateShip();
    Player CreatePlayer();
    Board CreateBoard(int width, int height);
    Coordinate CreateCoordinate(int x, int y);
}
