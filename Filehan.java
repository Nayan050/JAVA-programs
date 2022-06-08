import java.io.*;

public class Filehan {
    public static void main(String[] args) throws Exception {

        FileReader fh = new FileReader("C:\\Users\\Nayan Acharya\\Desktop\\test.txt");
        int i;
        while ((i = fh.read()) != -1) {
            System.out.print((char)i);

        }

        System.out.println("File created");

    }

}
