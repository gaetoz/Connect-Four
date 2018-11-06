public class Map {
    Tile[][] map;
    int rows;
    int columns;


    public Map(int x, int y) {
        this.rows = x;
        this.columns = y;
        this.map = new Tile[x][y];

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

