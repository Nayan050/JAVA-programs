import java.util.Scanner;

public class ltm {
    public static void main(String args[]) {
        int a, b, c;
        Scanner ls = new Scanner(System.in);
        System.out.println("Enter two numbers ");
        a = ls.nextInt();
        b = ls.nextInt();
        if (a > b)
            c = a;
        else
            c = b;
        System.out.println("the largest of two is : " + c);

    }
}