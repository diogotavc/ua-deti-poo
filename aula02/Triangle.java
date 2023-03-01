package aula02;
import java.util.Scanner;
import outros.UserInput;

public class Triangle {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, angle = 0;

        System.out.println("Insira o valor do cateto A: ");
        a = UserInput.getPositiveNumber(sc);
        System.out.println("Insira o valor do cateto B: ");
        b = UserInput.getPositiveNumber(sc);

        sc.close();

        c = Math.sqrt(
            Math.pow(a, 2) + Math.pow(b, 2)
        );

        angle = Math.acos(a/c) * 180 / Math.PI;

        System.out.printf("O comprimento da hipotenusa é %.2f e o valor do angulo entre o cateto A e a hipotenusa é %.2f°\n", c, angle);

    }
}
