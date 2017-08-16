package game;

public interface AbstractBattleshipFactory {
    Ship CreateShip();
    Player CreatePlayer();
    Board CreateBoard();
    Coordinate CreateCoordinate(int x, int y);
}
