package Minesweeper;



public class MinesweeperGame  {
    private static final int SIDE = 9;
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];

   // @Override
    public void initialize() {
       // setScreenSize(SIDE, SIDE);
        createGame();
    }

    private void createGame() {
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                gameField[y][x] = new GameObject(x, y);
              //  setCellColor(x, y, Color.GREEN);
            }
        }
    }
}
