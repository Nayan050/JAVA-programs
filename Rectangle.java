public class Rectangle {
    double length, width;

    Rectangle() {
        length = 1;
        width = 1;
    }

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double getArea() {
        return (length * width);
    }

    double getPerimeter() {
        return (2 * (length + width));
    }
}

public class TestRectangle {

    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle();

        Rectangle rect2 = new Rectangle(15.0, 8.0);

        System.out.println("Area of first object=" + rect1.getArea());
        System.out.println("Perimeter of first object=" + rect1.getPerimeter());
        System.out.println("Area of second object=" + rect2.getArea());
        System.out.println("Perimeter of second object=" + rect2.getPerimeter());
    }

}