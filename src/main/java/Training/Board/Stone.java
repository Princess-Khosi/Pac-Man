package Training.Board;

public class Stone implements Tracker{

    int verticalMovement;
    int horizontalMovement;
    int stepUnit = 3;

    public Stone(int UpDown, int LeftRight){
        verticalMovement = UpDown;
        horizontalMovement = LeftRight;
    }

    public int getVerticalMovement() {
        return verticalMovement;
    }

    public int getHorizontalMovement() {
        return horizontalMovement;
    }

    public int goUp(int y) {
        return y+=stepUnit;
    }

    public int goDown(int y) {
        return y-=stepUnit;
    }

    public int goLeft(int x) {
        return x-=stepUnit;
    }

    public int goRight(int x) {
        return x+=stepUnit;
    }
}
