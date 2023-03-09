package outros;
import java.util.Scanner;

public class UserInput {
    public static String input(Scanner sc, String message) {
        System.out.print(message);
        return sc.next();
    }

    public static double getNumberBetween(Scanner sc, double minValue, double maxValue) {
        double inputValue;
        do {
            inputValue = sc.nextDouble();
        } while (inputValue > maxValue || inputValue < minValue);
        return inputValue;
    }

    public static int getIntBetween(Scanner sc, int minValue, int maxValue) {
        int inputValue;
        do {
            inputValue = sc.nextInt();
        } while (inputValue > maxValue || inputValue < minValue);
        return inputValue;
    }

    public static double getPositiveNumber(Scanner sc) {
        double inputValue;
        do {
            inputValue = sc.nextDouble();
        } while (inputValue <= 0);
        return inputValue;
    }

    public static double multipleOf(Scanner sc, double multiple) {
        double inputValue;
        do {
            inputValue = sc.nextDouble();
        } while (inputValue % multiple != 0);
        return inputValue;
    }
}
