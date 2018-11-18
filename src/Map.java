// adding behavior changing the state of the map from previous class DiscPlacement

import java.util.Random;
import java.util.Scanner;

public class Map {
    //making Tile[][] private
    private Tile[][] map;
    public final int rows = 6;
    public final int columns = 7;

    public Map() {
        this.map = new Tile[rows][columns];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                map[i][j] = new EmptyTile(i,j);
            }
        }
    }

    public Tile[][] getMap() {
        return map;
    }

    public void displayMap(){
        System.out.println("   0123456");
        for(int i = 0; i < rows; i++) {
            System.out.print( i + " |");
            for (int j = 0; j < columns; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println("| " + i);
        }
        System.out.println("   0123456");
    }

    public void placingODisc() {
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
            if (map[x][y] instanceof EmptyTile) {
                map[x][y] = new ODisc(x, y);
                break;
            }
        }
    }

    public void placingXDisc() {
        Scanner input = new Scanner(System.in);

        System.out.print("Choose column number where you want to place 'X' Disc [0-6] ");
        //int x = grid.rows;
        int y = input.nextInt(); // = grid.columns

        for (int x = 5; x >= 0; x--) {
            //exception when full column
            if (map[x][y] instanceof EmptyTile) {
                map[x][y] = new XDisc(x, y);
                break;
            }
        }
    }


    public void computerPlacingODisc(){

        Random rand = new Random();
        int y = rand.nextInt(columns);

        for (int x = 5; x >= 0; x--) {
            if (map[x][y] instanceof EmptyTile) {
                map[x][y] = new ODisc(x, y);
                break;
            }
        }
        System.out.println("Computer places 'O' in column " + y );
        System.out.println();


    }

    public void computerPlacingXDisc(){

        Random rand = new Random();
        int y = rand.nextInt(columns);

        for (int x = 5; x >= 0; x--) {
            if (map[x][y] instanceof EmptyTile) {
                map[x][y] = new XDisc(x, y);
                break;
            }
        }
        System.out.println("Computer places 'X' in column " + y);
        System.out.println();
    }
}

