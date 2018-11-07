public class Map {
    Tile[][] map;
    final int rows = 6;
    final int columns = 7;


    public Map() {
        //this.rows = 6;
        //this.columns = 7;
        this.map = new Tile[rows][columns];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                map[i][j] = new EmptyTile(i,j);
            }
        }
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
}

