public class ConnectFour {

    public static void main(String[] args) {
        Map grid = new Map();
        ConnectFour game = new ConnectFour();
        game.gameOn(grid);
        grid.displayMap();
    }

    public void gameOn(Map grid){
        OorX OX = new OorX();
        FirstTurn XO = new FirstTurn();

        String choice = OX.discSelection();
        String first = XO.first();

        while(choice.equals("O") && first.equals("O")) {
            grid.placingODisc();
            grid.displayMap();
            if (gameOver(grid)) {
                System.exit(0);
            }
            grid.computerPlacingXDisc();
            grid.displayMap();
            if (gameOver(grid)) {
                System.exit(0);
            }
        }

        while (choice.equals("X") && first.equals("X")) {
            grid.placingXDisc();
            grid.displayMap();
            if(gameOver(grid)){
                System.exit(0);
            }
            grid.computerPlacingODisc();
            grid.displayMap();
            if(gameOver(grid)){
                System.exit(0);
            }
        }

        while(choice.equals("O") && first.equals("X")) {
            grid.computerPlacingXDisc();
            grid.displayMap();
            if (gameOver(grid)) {
                System.exit(0);
            }
            grid.placingODisc();
            grid.displayMap();
            if (gameOver(grid)) {
                System.exit(0);
            }
        }

        while (choice.equals("X") && first.equals("O")) {
            grid.computerPlacingODisc();
            grid.displayMap();
            if(gameOver(grid)){
                System.exit(0);
            }
            grid.placingXDisc();
            grid.displayMap();
            if(gameOver(grid)){
                System.exit(0);
            }
        }
    }

    public boolean gameOver(Map grid) {

        //  ENUM ? XDisc and ODisc?

        for (int i = 0; i < grid.rows; i++) {
            for (int j = 0; j < grid.columns; j++) {
                if(grid.getMap()[i][j].toString2().equals(" ")){
                    break;
                }
                if(grid.getMap()[i][j].toString2().equals("XDisc")) {

                    if (i < 3 && grid.getMap()[i][j].toString2().equals("XDisc") && grid.getMap()[i + 1][j].toString2().equals("XDisc") && grid.getMap()[i + 2][j].toString2().equals("XDisc") && grid.getMap()[i + 3][j].toString2().equals("XDisc")) {
                        System.out.println();
                        System.out.println("Congratulations! Player with 4 Xs in a row WINS! ");
                        return true;
                    }
                    if (j < 4 && grid.getMap()[i][j].toString2().equals("XDisc") && grid.getMap()[i][j + 1].toString2().equals("XDisc") && grid.getMap()[i][j + 2].toString2().equals("XDisc") && grid.getMap()[i][j + 3].toString2().equals("XDisc")) {
                        System.out.println();
                        System.out.println("Congratulations! Player with 4 Xs in a row WINS! ");
                        return true;
                    }
                    if (i < 2 && j < 2 && grid.getMap()[i][j].toString2().equals("XDisc") && grid.getMap()[i + 1][j + 1].toString2().equals("XDisc") && grid.getMap()[i + 2][j + 2].toString2().equals("XDisc") && grid.getMap()[i + 3][j + 3].toString2().equals("XDisc")) {
                        System.out.println();
                        System.out.println("Congratulations! Player with 4 Xs in a row WINS! ");
                        return true;
                    }
                    if (i > 2 && j < 3 && grid.getMap()[i][j].toString2().equals("XDisc") && grid.getMap()[i - 1][j + 1].toString2().equals("XDisc") && grid.getMap()[i - 2][j + 2].toString2().equals("XDisc") && grid.getMap()[i - 3][j + 3].toString2().equals("XDisc")) {
                        System.out.println();
                        System.out.println("Congratulations! Player with 4 Xs in a row WINS! ");
                        return true;
                    }
                }
                if(grid.getMap()[i][j].toString2().equals("ODisc")){
                    if (i < 3 && grid.getMap()[i][j].toString2().equals("ODisc") && grid.getMap()[i + 1][j].toString2().equals("ODisc") && grid.getMap()[i + 2][j].toString2().equals("ODisc") && grid.getMap()[i + 3][j].toString2().equals("ODisc")) {
                        System.out.println();
                        System.out.println("Congratulations! Player with 4 Os in a row WINS! ");
                        return true;
                    }
                    if (j < 4 && grid.getMap()[i][j].toString2().equals("ODisc") && grid.getMap()[i][j + 1].toString2().equals("ODisc") && grid.getMap()[i][j + 2].toString2().equals("ODisc") && grid.getMap()[i][j + 3].toString2().equals("ODisc")) {
                        System.out.println();
                        System.out.println("Congratulations! Player with 4 Os in a row WINS! ");
                        return true;
                    }
                    if (i < 2 && j < 2 && grid.getMap()[i][j].toString2().equals("ODisc") && grid.getMap()[i + 1][j + 1].toString2().equals("ODisc") && grid.getMap()[i + 2][j + 2].toString2().equals("ODisc") && grid.getMap()[i + 3][j + 3].toString2().equals("ODisc")) {
                        System.out.println();
                        System.out.println("Congratulations! Player with 4 Os in a row WINS! ");
                        return true;
                    }
                    if (i > 2 && j < 3 && grid.getMap()[i][j].toString2().equals("ODisc") && grid.getMap()[i - 1][j + 1].toString2().equals("ODisc") && grid.getMap()[i - 2][j + 2].toString2().equals("ODisc") && grid.getMap()[i - 3][j + 3].toString2().equals("ODisc")) {
                        System.out.println();
                        System.out.println("Congratulations! Player with 4 Os in a row WINS! ");
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
