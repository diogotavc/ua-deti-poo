package aula02;
import java.util.Scanner;
import outros.UserInput;

public class CelsiusToFahrenheit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double celsius, fahrenheit;

		System.out.print("Insira a temperatura em Celsius (C): ");
		celsius = UserInput.getPositiveNumber(sc);
		fahrenheit = 1.8 * celsius + 32;
		System.out.println("A temperatura em Fahrenheit (F) é " + fahrenheit);
		sc.close();
	}
}
