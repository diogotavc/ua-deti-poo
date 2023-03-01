package aula02;
import java.util.Scanner;
import outros.UserInput;

public class TotalValue {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o investimento inicial: ");
        Double investment = UserInput.getPositiveNumber(sc);
        sc.nextLine();

        String rateString = UserInput.input(sc, "Insira a taxa de juro:\n(1% e 0.01 são ambos válidos)");
        
        Float rate;

        if (rateString.contains("%")) {
            rate = Float.parseFloat(rateString.replace("%", "")) / 100;
        } else {
            rate = Float.parseFloat(rateString);
        }

        System.out.println("Insira o número de meses: ");
        Integer months = (int) UserInput.getPositiveNumber(sc);

        for (int i=1; i <= months ; i++){
            investment = investment + (investment * rate);
        }

        rate = rate * 100;

        System.out.printf("Com uma taxa de juro de %s%%, o valor ao final de %s meses será de %,.3f€.\n", rate, months, investment);
        sc.close();
    }
}