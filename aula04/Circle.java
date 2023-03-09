package aula04;

public class Circle {
    private double radius;

    public Circle(double radius) {
        assert radius > 0;
        this.radius = radius;
    }

    public void setRadius(double radius) {
        assert radius > 0;
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getCircumference() {
        double circumference = 2 * Math.PI * this.radius;
        return circumference;
    }

    public double getArea() {
        double area = Math.PI * Math.pow(this.radius, 2);
        return area;
    }

    public String toString() {
        return "Circle with radius " + this.radius;
    }

    public boolean equals(Circle circle2) {
        return this.radius == circle2.radius;
    }
}
