package Training;

public class Stone implements Tracker{

    final int verticalMovement;
    final int horizontalMovement;

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


    public int moveHorizontally(){
        return 0;
    }

    public int moveVertically(){
        return 0;
    }
}
