import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class l3m {
    public static void main(String args[]) {
        int a, b, c, d;
        Scanner ls = new Scanner(System.in);
        System.out.println("Enter three numbers ");
        a = ls.nextInt();
        b = ls.nextInt();
        c = ls.nextInt();
        if (a > b)
            d = a;
        else if (b > c)
            d = b;
        else
            d = c;
        System.out.println("the largest of three is : " + d);

    }
}