import java.util.Random;

public class FirstTurn {
    public String first(){
        String result = "O";
        Random coinToss = new Random();
        int toss = coinToss.nextInt(2);

        if(toss == 0){
            result = "O";
        }

        if(toss == 1){
            result = "X";
        }

        System.out.println(result + " starts the game!");
        return result;
    }

}
