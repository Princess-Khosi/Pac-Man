package Training.Board;


public class Maze {
    Stone wall; //A difference between two values that is greater than 2
    Stone corner; //A pair of co-ordinates
    final int boardSpan = 100;

    public int getMiddlePosition() {
        return boardSpan;
    }

    public void crashWall() {

    }

    public Stone getCorner() {
        return corner;
    }

    public void setCorner(Stone corner) {
        this.corner = corner;
    }

    public Stone getWall() {
        return wall;
    }

    public void setWall(Stone wall) {
        this.wall = wall;
    }

    public static void display(){
        String just = "nothing";
    }
}
