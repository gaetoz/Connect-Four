// too high complexity - Big-O

public class GameLoop {

    public boolean gameOver(Map grid) {

        for (int i = 0; i < grid.rows; i++) {
            for (int j = 0; j < grid.columns; j++) {
                if (i < 3 && grid.map[i][j] instanceof XDisc && grid.map[i+1][j] instanceof XDisc && grid.map[i+2][j] instanceof XDisc && grid.map[i+3][j] instanceof XDisc){
                    System.out.println();
                    System.out.println("Congratulations! Player with 4 Xs in a row WINS! ");
                    return true;
                }
                if (j < 4 && grid.map[i][j] instanceof XDisc && grid.map[i][j+1] instanceof XDisc && grid.map[i][j+2] instanceof XDisc && grid.map[i][j+3] instanceof XDisc){
                    System.out.println();
                    System.out.println("Congratulations! Player with 4 Xs in a row WINS! ");
                    return true;
                }
                if (i < 2  && j < 2 && grid.map[i][j] instanceof XDisc && grid.map[i+1][j+1] instanceof XDisc && grid.map[i+2][j+2] instanceof XDisc && grid.map[i+3][j+3] instanceof XDisc){
                    System.out.println();
                    System.out.println("Congratulations! Player with 4 Xs in a row WINS! ");
                    return true;
                }
                if (i > 2 && j < 3 && grid.map[i][j] instanceof XDisc && grid.map[i-1][j+1] instanceof XDisc && grid.map[i-2][j+2] instanceof XDisc && grid.map[i-3][j+3] instanceof XDisc){
                    System.out.println();
                    System.out.println("Congratulations! Player with 4 Xs in a row WINS! ");
                    return true;
                }


                if (i < 3 && grid.map[i][j] instanceof ODisc && grid.map[i+1][j] instanceof ODisc && grid.map[i+2][j] instanceof ODisc && grid.map[i+3][j] instanceof ODisc){
                    System.out.println();
                    System.out.println("Congratulations! Player with 4 Os in a row WINS! ");
                    return true;
                }
                if (j < 4 && grid.map[i][j] instanceof ODisc && grid.map[i][j+1] instanceof ODisc && grid.map[i][j+2] instanceof ODisc && grid.map[i][j+3] instanceof ODisc){
                    System.out.println();
                    System.out.println("Congratulations! Player with 4 Os in a row WINS! ");
                    return true;
                }
                if (i < 2  && j < 2 && grid.map[i][j] instanceof ODisc && grid.map[i+1][j+1] instanceof ODisc && grid.map[i+2][j+2] instanceof ODisc && grid.map[i+3][j+3] instanceof ODisc){
                    System.out.println();
                    System.out.println("Congratulations! Player with 4 Os in a row WINS! ");
                    return true;
                }
                if (i > 2 && j < 3 && grid.map[i][j] instanceof ODisc && grid.map[i-1][j+1] instanceof ODisc && grid.map[i-2][j+2] instanceof ODisc && grid.map[i-3][j+3] instanceof ODisc){
                    System.out.println();
                    System.out.println("Congratulations! Player with 4 Os in a row WINS! ");
                    return true;
                }

            }
        }
        return false;
    }

    public void gameOn(Map grid){
        DiscPlacement test = new DiscPlacement();
        OorX OX = new OorX();
        FirstTurn XO = new FirstTurn();

        String choice = OX.discSelection();
        String first = XO.first();


        //added while loop condition setting which player starts first.
        while(choice.equals("O") && first.equals("O")) {
            test.placingODisc(grid);
            grid.displayMap();
            if (gameOver(grid)) {
                System.exit(0);
            }
            test.computerPlacingXDisc(grid);
            grid.displayMap();
            if (gameOver(grid)) {
                System.exit(0);
            }
        }

        while (choice.equals("X") && first.equals("X")) {
            test.placingXDisc(grid);
            grid.displayMap();
            if(gameOver(grid)){
                System.exit(0);
            }
            test.computerPlacingODisc(grid);
            grid.displayMap();
            if(gameOver(grid)){
                System.exit(0);
            }
        }

        while(choice.equals("O") && first.equals("X")) {
            test.computerPlacingXDisc(grid);
            grid.displayMap();
            if (gameOver(grid)) {
                System.exit(0);
            }
            test.placingODisc(grid);
            grid.displayMap();
            if (gameOver(grid)) {
                System.exit(0);
            }
        }

        while (choice.equals("X") && first.equals("O")) {
            test.computerPlacingODisc(grid);
            grid.displayMap();
            if(gameOver(grid)){
                System.exit(0);
            }
            test.placingXDisc(grid);
            grid.displayMap();
            if(gameOver(grid)){
                System.exit(0);
            }
        }
    }
}

