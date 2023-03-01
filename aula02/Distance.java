package aula02;
import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ponto p1");
        System.out.println("Insira o x do p1: ");
        Double x1 = sc.nextDouble();
        System.out.println("Insira o y do p1: ");
        Double y1 = sc.nextDouble();

        System.out.println("Ponto p2");
        System.out.println("Insira o x do p2: ");
        Double x2 = sc.nextDouble();
        System.out.println("Insira o y do p2: ");
        Double y2 = sc.nextDouble();

        double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

        System.out.printf("A distância entre os dois pontos é %.3f\n", distance);

        sc.close();
    }
    
}
