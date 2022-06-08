import java.io.*;

public class main {
    public static void main(String args[]) {
        Console in = System.console();
        String str = "I  don't  want  to  study";
        StringBuffer sb = new StringBuffer("Okay Bye!");
        System.out.println("Length  of  String  object  " + str.length());
        System.out.println("Capacity  of  StringBuffer  object  " + sb.capacity());
        System.out.println("Length  of  StringBuffer  object  " + sb.length());
        System.out.println("Enter  name  to  reverse");
        String s = in.readLine();
        String r = new String();
        for (int i = s.length() - 1; i >= 0; i--)
            r += s.charAt(i);
        System.out.println("Reverse  of  " + s + "  is  -  " + r);
        r = r.toUpperCase();
        System.out.println("Its  Uppercase  -  " + r);
        System.out.println("Enter  String  to  Append");
        String a = in.readLine();
        System.out.println("Appending  String  " + a + "  with  " + r + "  is  -  " + r.concat(a));
        sb = new StringBuffer(s);
        System.out.println("Append  using  StringBuffer  " + sb.append(a));
        System.out.println("Reverse  using  StringBuffer  " + sb.reverse());

        System.out.println("The  original  String  is:  " + str);
        System.out.println("The  substring  is:  " + str.substring(8));
    }
}
