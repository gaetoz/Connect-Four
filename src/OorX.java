import java.util.Scanner;


public class OorX {
    public String discSelection() {
        Scanner input = new Scanner(System.in);
        String discChoice;

        do {
            System.out.println("Choose disc type/letter O/X (capital letter) ");
            discChoice = input.next();
        }
        while (!discChoice.equals("O") && !discChoice.equals("X"));


        return discChoice;
    }
}
