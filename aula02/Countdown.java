package aula02;
import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o valor de N: ");
        int n = sc.nextInt();
        for (int i = n; i >= 0; i--) {
            System.out.print(i%10 == 0 ? i + "\n" : i + ",");
        }

        sc.close();
    }
}
