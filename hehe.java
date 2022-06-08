abstract class shape 
{
    String shape_name;
    abstract void area();
}
    
    class sphere extends shape{
        double r=11;
        void area()
        {
            System.out.println("Area of sphere = "+ (4*3.14*r*r));
        }
    }  class rectangle extends shape{
        int l=15,w=16;
        void area()
        {
            System.out.println("Area of rectangle = "+ (l*w));
        }
    }  class triangle extends shape{
        double b=7.5,h=18;
        void area()
        {
            System.out.println("Area of triangle  = "+ (0.5*b*h));
        }
    }


public class hehe{
    public static void main(String []args) {
        sphere obj1 = new sphere();
        rectangle obj2 = new rectangle();
        triangle obj3 = new triangle();
        obj1.area();
        obj2.area();
        obj3.area();

    }
}
