package aula03;
import outros.UserInput;
import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        int[] data = getValues();
        int monthDays = monthDays(data[0], data[1]);
        int firstDay = firstDayOfMonth(data[0], data[1]);
        printCalendar(data[0], data[1], firstDay, monthDays);
        System.out.println();
    }

    private static int[] getValues() {
        Scanner sc = new Scanner(System.in);

        String[] monthYear = UserInput.input(sc, "Introduza o mês/ano no formato mm/yyyy: ").split("/");
        sc.close();

        return new int[]{Integer.parseInt(monthYear[0]), Integer.parseInt(monthYear[1])};
    }

    private static int monthDays(int month, int year) {
        switch (month) {
            case 2:
                if (year % 100 == 0 ? year % 400 == 0 : year % 4 == 0)
                    return 29;
                else
                    return 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    private static int firstDayOfMonth(int month, int year) {
        int day = 1;
        int[] monthTable = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        if (month < 3)
            year -= 1;
        int firstDay = (year + year/4 - year/100 + year/400 + monthTable[month-1] + day) % 7;
        return firstDay + 1;
    }

    private static void printCalendar(int month, int year, int firstDay, int monthDays) {
        String[] monthNames = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        System.out.printf("\n%15s %d\n", monthNames[month-1], year);
        System.out.println("Dom Seg Ter Qua Qui Sex Sab");

        for (int i = 1; i < firstDay; i++)
            System.out.print("    ");

        for (int monthDay = 1; monthDay <= monthDays; monthDay++) {
            System.out.printf("%3d ", monthDay);
            if ((monthDay + firstDay - 1) % 7 == 0)
                System.out.println();
        }
    }
}