package aula03;
import java.util.Scanner;
import outros.UserInput;

public class Grades {
    private static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("Quantos estudantes na turma? ");
        int numberOfStudents = sc.nextInt();
        Student[] students = new Student[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("Introduza a nota teórica do aluno %d: ", i + 1);
            double theoreticalGrade = UserInput.getNumberBetween(sc, 0, 20);
            System.out.printf("Introduza a nota prática do aluno %d: ", i + 1);
            double practicalGrade = UserInput.getNumberBetween(sc, 0, 20);
            students[i] = new Student(theoreticalGrade, practicalGrade);
        }
        
        printGrades(students);
        System.out.println();
    }

    private static class Student {
        private double theoreticalGrade;
        private double practicalGrade;
        private int finalGrade;

        public Student(double theoreticalGrade, double practicalGrade) {
            this.theoreticalGrade = theoreticalGrade;
            this.practicalGrade = practicalGrade;
            this.finalGrade = (this.theoreticalGrade < 7 || this.practicalGrade < 7) ? 66 :
                (int) Math.round(0.4 * this.theoreticalGrade + 0.6 * this.practicalGrade);
        }

        public double getTheoreticalGrade() {
            return theoreticalGrade;
        }

        public double getPracticalGrade() {
            return practicalGrade;
        }

        public int getFinalGrade() {
            return finalGrade;
        }
    }

    private static void printGrades(Student[] students) {
        System.out.println("NotaT  NotaP  Pauta");
        for (Student student : students) {
            System.out.printf("%5.1f  %5.1f  %5d\n", student.getTheoreticalGrade(),
                student.getPracticalGrade(), student.getFinalGrade());
        }
    }
}