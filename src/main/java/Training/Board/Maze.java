package Training.Board;

public class Maze {
    int wall; //A difference between two values that is greater than 2
    int corner; //A pair of co-ordinates
    int middlePosition;

    public int getMiddlePosition() {
        return middlePosition;
    }

    public void setMiddlePosition(int middlePosition) {
        this.middlePosition = middlePosition;
    }

    public void crashWall() {

    }

    public int getCorner() {
        return corner;
    }

    public void setCorner(int corner) {
        this.corner = corner;
    }

    public int getWall() {
        return wall;
    }

    public void setWall(int wall) {
        this.wall = wall;
    }
}
