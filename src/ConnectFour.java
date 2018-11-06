// bug: 2nd player allowed to play a last turn after 1st has already won (print victory announcement and system exit come after)


public class ConnectFour {
    public static void main(String args[]){
        Map grid = new Map(6,7);
        GameLoop gameLoop = new GameLoop();

        grid.displayMap();
        gameLoop.gameOn(grid);


    }


}