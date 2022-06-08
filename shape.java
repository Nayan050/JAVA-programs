abstract class shape {
    String shapename;

    abstract double area();

    abstract String string1();

}

// ii) Create a subclass named "Sphere" which has radius and its area given by
// the formula 4*PI*r^2.
class sphere extends shape {
    double radius = 4;
    static double pi = 3.14;

    String string1() {
        shapename = "sphere";
        return (shapename);
    }

    double area() {
        return 4 * pi * radius * radius;
    }
}

// iii) Create a subclass named "Rectangle" which has length and width and its
// area is leng th times width.
class rectangle extends shape {
    double length = 4;
    double width = 3;

    String string1() {
        shapename = "Rectangle";
        return (shapename);
    }

    double area() {
        return length * width;
    }
}

// iv)Create a subclass named "Triangle" which has base and height and its area
// is ½*base*h eight.
class triangle extends shape {
    double base = 4;
    double height = 3;

    String string1() {
        shapename = "Triangle";
        return (shapename);
    }

    double area() {
        return ((base * height) / 2);
    }

    }

    // v)Create another class which displays the calculated area. public class main{
    public static void main(String args[]) {
        sphere s = new sphere();
        String s1 = s.string1();
        System.out.println(s1);
        double s2 = s.area();
        System.out.println("area  of  sphere  =" + s2);

        rectangle s3 = new rectangle();
        String s4 = s3.string1();
        System.out.println(s4);
        double s5 = s3.area();
        System.out.println("Area  of  rectangle  =" + s5);

        triangle s6 = new triangle();
        String s7 = s6.string1();
        System.out.println(s7);
        double s8 = s6.area();
        System.out.println("Area  of  triangle  =" + s8);

    }
}
