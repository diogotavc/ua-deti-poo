package aula02;
import java.util.Scanner;

public class MedianVelocity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double v1, d1, v2, d2;

        do {
            System.out.print("Digite a velocidade do primeiro trajeto em km/h: ");
            v1 = sc.nextDouble();
            System.out.print("Digite a distância do primeiro trajeto em km: ");
            d1 = sc.nextDouble();
            if (v1 <= 0 || d1 <= 0) {
                System.out.println("Valores inválidos! A velocidade e a distância devem ser positivas.");
            }
        } while (v1 <= 0 || d1 <= 0);

        do {
            System.out.print("Digite a velocidade do segundo trajeto em km/h: ");
            v2 = sc.nextDouble();
            System.out.print("Digite a distância do segundo trajeto em km: ");
            d2 = sc.nextDouble();
            if (v2 <= 0 || d2 <= 0) {
                System.out.println("Valores inválidos! A velocidade e a distância devem ser positivas.");
            }
        } while (v2 <= 0 || d2 <= 0);

        Double medianVelocity = (d1 + d2) / ( (d1 / v1) + (d2 / v2) );

        System.out.printf("A velocidade média final é %.2f km/h.%n", medianVelocity);
        sc.close();
    }
}
