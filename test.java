import java.util.Scanner;

public class test{
    public static void main(String[] args){
        System.out.println("Hii Nayan");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a= sc.nextInt();
        System.out.println("Enter the value of b : ");
        int b=sc.nextInt();
        System.out.println("The sum of a and b is :" +" "+ (a+b));
        System.out.println("The subtraction of a and b is :" + " "+ (a - b));
        System.out.println("The multliplication of a and b is :" +" "+ (a*b));
        System.out.println("The division of a and b is :" +" "+ (a/b));
        System.out.println("The modulus of a and b is :" +" "+ (a%b));

        int u=5,v=6,w=8;
        int sum=u+v+w;
        System.out.println(sum);
        
        float subject1 = 67;
        float subject2 = 54;
        float subject3 = 69;
        float cgpa= (subject1+subject2+subject3)/30;
        System.out.println(cgpa);

        System.out.println("What's your name : " );
        String name = sc.next();
        System.out.println("Hello " + name + " have a good day!");

       System.out.println("Enter the value in kilometer : ");
       float km= sc.nextFloat();
       double miles = ((km)/(1.609)); 
       System.out.println(km + " " + "km is equals to " + miles +" "+ "miles.");
    System.out.println("Enter your number");
    // Scanner sc = new Scanner(System.in);
    System.out.println(sc.hasNextInt());

    }
}