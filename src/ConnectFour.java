
public class ConnectFour {
    public static void main(String args[]){
        Map grid = new Map();
        GameLoop gameLoop = new GameLoop();

        grid.displayMap();
        gameLoop.gameOn(grid);


    }


}