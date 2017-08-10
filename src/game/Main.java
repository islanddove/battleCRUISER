package game;

import GUI.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        GameFactory factory = new GameFactory();
        //TODO Also pass the GUI into the game through the constructor.
        // GUI gui = new GUI(example);

        Game game= new Game(factory);
        game.run();

    }
}
