package aula02;
import java.util.Scanner;
import outros.UserInput;

public class Time {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira os segundos para serem convertidos: ");
        int initialSeconds = (int) UserInput.getPositiveNumber(sc);

        int hours = initialSeconds / 60 / 60;
        int minutes = initialSeconds / 60 % 60;
        int seconds = initialSeconds % 60 % 60;

        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
        sc.close();
    }
}
