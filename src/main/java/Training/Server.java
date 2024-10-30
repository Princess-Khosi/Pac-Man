package Training;
import Training.Board.Maze;
import io.javalin.Javalin;

public class Server {

    private Maze playingBoard;

    public static void main(String[] args) {
        var app = Javalin.create().get("/", ctx -> ctx.result("Hello World")).start(7070);
    }

    //As the player presses start, the maze is displayed.

}