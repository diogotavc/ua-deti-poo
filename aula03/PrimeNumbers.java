package aula03;
import java.util.Scanner;
import outros.UserInput;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o número desejado:");
        int number = (int) UserInput.getPositiveNumber(sc);
        int sum = 0;

        for (int i = number; i >= 0; i--) {
            if (isPrime(i)) {
                sum += 1;
            }
        }

        System.out.printf("A soma dos números primos até %d é %d.\n", number, sum);

        sc.close();
    }

    static  boolean isPrime(int num) {
        if(num <= 1) {
            return false;
        }

       for(int i=2; i<=num/2; i++) {
            if ((num%i) == 0) {
                return false;
       }}

       return true;
    }
}