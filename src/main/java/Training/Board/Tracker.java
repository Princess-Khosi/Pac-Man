package Training.Board;

/*
*This interface will be used by the maze and the stone
* It is meant to create a contract for movements in the world
*
*/
public interface Tracker {
    int STEP = 2;

    int goUp(int y);
    int goDown(int y);
    int goLeft(int x);
    int goRight(int x);
}
