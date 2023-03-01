package aula01;
import java.util.Scanner;

public class RealNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int readNumbers = 1;

        System.out.println("Introduza os valores necessários.\nPara terminar, basta inserir o primeiro número.");
        double firstValue = sc.nextDouble();
        double maxValue = firstValue;
        double minValue = firstValue;
        double sumOfValues = firstValue;

        double number;
        
        do {
            number = sc.nextDouble();
            if (number > maxValue)
                maxValue = number;
            if (number < minValue)
                minValue = number;
            sumOfValues += number;
            ++readNumbers;
        } while (number != firstValue);

        System.out.printf("Valor máximo: %f\nValor mínimo: %f\nMédia: %f\nTotal: %f\n", maxValue, minValue, (float) sumOfValues/readNumbers, sumOfValues);

        sc.close();
    }
}
