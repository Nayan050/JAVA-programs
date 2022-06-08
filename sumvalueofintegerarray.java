import java.util.Scanner;

public class sumvalueofintegerarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element you want to add : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i : a) {
            sum = sum + i;
        }
        System.out.println("Sum of the elements =" + sum);
    }
}
