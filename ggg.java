import java.util.Scanner;

class ggg {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b, sum, sub, mul, div;
        System.out.println("Enter the number a :");
        a = sc.nextInt();
        System.out.println("Enter the number b :");
        b = sc.nextInt();
        sum = a + b;
        sub = a - b;
        mul = a * b;
        div = a / b;
        System.out.println("the sum of a and b is : " + sum);
        System.out.println("the Subtraction of a and b is : " + sub);
        System.out.println("the multiplication of a and b is : " + mul);
        System.out.println("the division of a and b is : " + div);
    }
}