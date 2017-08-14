package game;

public interface AbstractBattleshipFactory {
    Ship CreateShip(int size);
    Player CreatePlayer();
    Board CreateBoard();
    Coordinate CreateCoordinate(int x, int y);
}
