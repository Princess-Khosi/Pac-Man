package Training.Board;

public class Stone implements Tracker{

    int verticalMovement;
    int horizontalMovement;

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

}
