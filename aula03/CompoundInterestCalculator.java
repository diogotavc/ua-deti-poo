package aula03;
import java.util.Scanner;
import outros.UserInput;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int months = 12;

        System.out.println("Insira o montante investido (positivo e múltiplo de 1000):");
        double investedAmount = UserInput.multipleOf(sc, 1000);
        System.out.println("Insira a taxa de juro mensal (entre 0 e 5%):");
        double interestRate = UserInput.getNumberBetween(sc, 0, 5);

        for (int i = 1; i <= months; i++) {
            investedAmount *= 1 + (interestRate/100);
            
            if(i == 1) {
                System.out.printf("Depois de %d mês: %.2f.\n", i, investedAmount);
            } else {
                System.out.printf("Depois de %d meses: %.2f.\n", i, investedAmount);
            }
        }

        sc.close();
    }
}
