package aula04;

public class Rectangle {
    public double length;
    public double width;

    public Rectangle(double length, double width) {
        assert length > 0 && width > 0;
        assert length > width;
        this.length = length;
        this.width = width;
    }
    
    public void setSides(double length, double width) {
        assert length > 0 && width > 0;
        assert length >= width;
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public double getPerimeter() {
        double perimeter = 2 * (this.length + this.width);
        return perimeter;
    }

    public double getArea() {
        double perimeter = this.length * this.width;
        return perimeter;
    }

    public String toString() {
        return "Rectangle with length " + this.length + " and width " + this.width;
    }

    public boolean equals(Rectangle rectangle2) {
        return this.length == rectangle2.length && this.width == rectangle2.width;
    }
}