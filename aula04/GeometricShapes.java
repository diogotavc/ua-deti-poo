package aula04;
import outros.UserInput;
import java.util.Scanner;

public class GeometricShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        while (true) {
            System.out.println("Escolha uma forma:\n0 - Sair\n1 - Retângulo\n2 - Triângulo\n3 - Círculo");
            
            int choice = UserInput.getIntBetween(sc, 0, 3);
            switch (choice) {
                case 0 -> {
                    sc.close();
                    System.exit(0);
                }
                case 1 -> {
                    System.out.print("\n\nComprimento do retângulo 1: ");
                    double length = UserInput.getPositiveNumber(sc);
                    System.out.print("Largura do retângulo 1: ");
                    double width = UserInput.getPositiveNumber(sc);
                    Rectangle rectangle1 = new Rectangle(length, width);
                    System.out.print("Comprimento do retângulo 2: ");
                    length = UserInput.getPositiveNumber(sc);
                    System.out.print("Largura do retângulo 2: ");
                    width = UserInput.getPositiveNumber(sc);
                    Rectangle rectangle2 = new Rectangle(length, width);
                    System.out.println("Retângulo 1: " + rectangle1);
                    System.out.println("Área do retângulo 1: " + rectangle1.getArea());
                    System.out.println("Perímetro do retângulo 1: " + rectangle1.getPerimeter());
                    System.out.println("Retângulo 2: " + rectangle2);
                    System.out.println("Área do retângulo 2: " + rectangle2.getArea());
                    System.out.println("Perímetro do retângulo 2: " + rectangle2.getPerimeter());
                    System.out.println("Retângulo 1 e igual ao retângulo 2? " + rectangle1.equals(rectangle2) + "\n\n");
                }
                case 2 -> {
                    System.out.print("\n\n\nLado 1 do triângulo 1: ");
                    double side1 = UserInput.getPositiveNumber(sc);
                    System.out.print("Lado 2 do triângulo 1: ");
                    double side2 = UserInput.getPositiveNumber(sc);
                    System.out.print("Lado 3 do triângulo 1: ");
                    double side3 = UserInput.getPositiveNumber(sc);
                    Triangle triangle1 = new Triangle(side1, side2, side3);
                    System.out.print("Lado 1 do triângulo 2: ");
                    side1 = UserInput.getPositiveNumber(sc);
                    System.out.print("Lado 2 do triângulo 2: ");
                    side2 = UserInput.getPositiveNumber(sc);
                    System.out.print("Lado 3 do triângulo 2: ");
                    side3 = UserInput.getPositiveNumber(sc);
                    Triangle triangle2 = new Triangle(side1, side2, side3);
                    System.out.println("Triângulo 1: " + triangle1);
                    System.out.println("Área do triângulo 1: " + triangle1.getArea());
                    System.out.println("Perímetro do triângulo 1: " + triangle1.getPerimeter());
                    System.out.println("Triângulo 2: " + triangle2);
                    System.out.println("Área do triângulo 2: " + triangle2.getArea());
                    System.out.println("Perímetro do triângulo 2: " + triangle2.getPerimeter());
                    System.out.println("Triângulo 1 e igual ao triângulo 2? " + triangle1.equals(triangle2) + "\n\n");
                }
                case 3 -> {
                    System.out.print("Raio do círculo 1: ");
                    double radius = UserInput.getPositiveNumber(sc);
                    Circle c1 = new Circle(radius);
                    System.out.print("Raio do círculo 2: ");
                    radius = UserInput.getPositiveNumber(sc);
                    Circle c2 = new Circle(radius);
                    System.out.println("Círculo 1: " + c1);
                    System.out.println("Área do círculo 1: " + c1.getArea());
                    System.out.println("Perímetro do círculo 1: " + c1.getCircumference());
                    System.out.println("Círculo 2: " + c2);
                    System.out.println("Área do círculo 2: " + c2.getArea());
                    System.out.println("Perímetro do círculo 2: " + c2.getCircumference());
                    System.out.println("Círculo 1 e igual ao círculo 2? " + c1.equals(c2) + "\n\n");
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    
    }
}