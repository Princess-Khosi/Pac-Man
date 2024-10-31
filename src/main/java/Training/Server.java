package Training;
import Training.Board.Maze;
import za.co.wethinkcode.io.Io;
import za.co.wethinkcode.io.StandardIo;

import java.util.HashMap;
import java.util.Map;

/*  FUNCTIONS OF SERVER
    - lISTENS FOR INPUT
    - RENDERS THE PLAYING BOARD
*/
public class Server {

    private Maze playingBoard;
    private final Io inputOutput;

    public Server(Io inputOutput, Maze playingBoard) {
        this.inputOutput = inputOutput;
        this.playingBoard = playingBoard;
    }

    public Server() {
        this(new StandardIo());
    }

    public Server(Io io) {
        if (io == null) throw new RuntimeException();
        this.playingBoard = new Maze();
        this.inputOutput = io;
    }

    public void homePage() {
        inputOutput.println("\n 1. Start");
        inputOutput.println("\n 2. Pause");
        inputOutput.println("\n 3. Game Rule");
        inputOutput.println("\n 4. High Scores");
        inputOutput.println("\n 5. Exit");
    }

    public void runner () {
        boolean exit = false;
        while(!exit){
            homePage();
            int option = inputOutput.anyInteger("What would you like to do? Select using number.");
            exit = handleOption(option);
        }
    }

    public boolean handleOption(int Option) {
        switch (Option) {
            case 1:
            case 2:
            case 3:
            case 4:
                Maze.display();
                return false;
            case 5:
                return true;
            default:
                inputOutput.println("Invalid option, please try again.");
                return false;
        }
    }


    public static void main(String[] args) {


    }

    //As the player presses start, the maze is displayed.

}