package aula03;
import java.util.Scanner;
import outros.UserInput;
import java.util.Random;

public class HighLow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        while (true) {
            String continueGame;
            int secret = rn.nextInt(100) + 1;
            int i = 1;
            int guess;

            do {
                System.out.printf("Tentativa número %d: ", i);
                guess = sc.nextInt();
                if (guess > secret) {
                    System.out.println("Número alto!");
                } else if (guess < secret) {
                    System.out.println("Número baixo!");
                } else {
                    break;
                }
                i++;

                continueGame = UserInput.input(sc, "Continuar?");

            } while (continueGame.equalsIgnoreCase("S") || continueGame.equalsIgnoreCase("Sim"));
            
            System.out.printf("O número secreto era: %d", secret);
            System.out.printf("Foram precisas %d tentativas.", i);

            System.out.println("Jogar novamente?");
            String playAgain = sc.next();
            if (playAgain.equalsIgnoreCase("N") || playAgain.equalsIgnoreCase("Não")) {
                break;
            }
        }
    }
}

