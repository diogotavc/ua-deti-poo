package aula04;

public class Triangle {
    public double side1;
    public double side2;
    public double side3;

    public Triangle(double side1, double side2, double side3) {
        assert side1 > 0 && side2 > 0 && side3 > 0;
        assert side1 < side2 + side3 && side2 < side1 + side3 && side3 < side1 + side2;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void setSides(double side1, double side2, double side3) {
        assert side1 > 0 && side2 > 0 && side3 > 0;
        assert side1 < side2 + side3 && side2 < side1 + side3 && side3 < side1 + side2;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getFirstSide() {
        return this.side1;
    }

    public double getSecondSide() {
        return this.side2;
    }

    public double getThirdSide() {
        return this.side3;
    }

    public double getPerimeter() {
        double perimeter = this.side1 + this.side2 + this.side3;
        return perimeter;
    }

    public double getArea() {
        double semiPerimeter = this.getPerimeter() / 2;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - this.side1) * (semiPerimeter - this.side2) * (semiPerimeter - this.side3));
        return area;
    }

    public String toString() {
        return "Triangle with side " + this.side1 + ", side " + this.side2 + ", and side " + this.side3;
    }

    public boolean equals(Triangle triangle2) {
        return this.side1 == triangle2.side1 && this.side2 == triangle2.side2 && this.side3 == triangle2.side3;
    }
}