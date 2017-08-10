package game;

public interface AbstractBattleshipFactory {
    Ship CreateShip();
    Player CreatePlayer();
    Board CreateBoard();
}
