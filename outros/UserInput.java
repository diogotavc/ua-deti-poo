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

    public static double getPositiveNumber(Scanner sc) {
        double inputValue;
        do {
            inputValue = sc.nextDouble();
        } while (inputValue <= 0);
        return inputValue;
    }
}
