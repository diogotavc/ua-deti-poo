package aula02;
import java.util.Scanner;
import outros.UserInput;

public class CalculateEnergy {
    public static void main(String[] args) {
        double waterAmount, initialTemp, finalTemp, energy;
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a quantidade da água em quilogramas (kg): ");
        waterAmount = UserInput.getPositiveNumber(sc);
        System.out.print("Insira a temperatura inicial da água em Celsius (C): ");
        initialTemp = UserInput.getPositiveNumber(sc);
        System.out.print("Insira a temperatura final da água em Celsius (C): ");
        finalTemp = UserInput.getPositiveNumber(sc);
        energy = waterAmount * (finalTemp - initialTemp) * 4184;
        System.out.print("A energia necessária em Joules (J) é: " + energy);
        sc.close();
    }
}
