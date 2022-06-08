import java.util.Scanner;

public class sumofnaturalnumbers {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}
