import java.util.Random;
import java.util.Scanner;


public class DiscPlacement {

    public void placingODisc(Map grid) {
        Scanner input = new Scanner(System.in);

        System.out.print("Choose column number where you want to place 'O' Disc [0-6] ");
        //int x = grid.rows;
        int y = input.nextInt(); // = grid.columns

        for (int x = 5; x >= 0; x--) {
            /**  need for exception handling when column is full
             *   following bugs
             *
             if (grid.map[x][y] instanceof ODisc && x == 0) {
             System.out.println("This column is already full. Try another column!");
             y = input.nextInt();
             for (x = 5; x >= 0; x--) {
             if (grid.map[x][y] instanceof EmptyTile) {
             grid.map[x][y] = new ODisc(x, y);
             break;
             }
             }
             }
             **/
            if (grid.map[x][y] instanceof EmptyTile) {
                grid.map[x][y] = new ODisc(x, y);
                break;
            }
        }
        computerPlacingXDisc(grid);
    }

    public void placingXDisc(Map grid) {
        Scanner input = new Scanner(System.in);

        System.out.print("Choose column number where you want to place 'X' Disc [0-6] ");
        //int x = grid.rows;
        int y = input.nextInt(); // = grid.columns

        for (int x = 5; x >= 0; x--) {
            //exception when full column
            if (grid.map[x][y] instanceof EmptyTile) {
                grid.map[x][y] = new XDisc(x, y);
                break;
            }
        }
        computerPlacingODisc(grid);
    }


    public void computerPlacingODisc(Map grid){

        Random rand = new Random();
        int y = rand.nextInt(grid.columns);

        for (int x = 5; x >= 0; x--) {
            if (grid.map[x][y] instanceof EmptyTile) {
                grid.map[x][y] = new ODisc(x, y);
                break;
            }
        }
        System.out.println("Computer places 'O' in column " + y );
        System.out.println();


    }

    public void computerPlacingXDisc(Map grid){

        Random rand = new Random();
        int y = rand.nextInt(grid.columns);

        for (int x = 5; x >= 0; x--) {
            if (grid.map[x][y] instanceof EmptyTile) {
                grid.map[x][y] = new XDisc(x, y);
                break;
            }
        }
        System.out.println("Computer places 'X' in column " + y);
        System.out.println();
    }
}
