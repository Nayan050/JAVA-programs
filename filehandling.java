import java.io.*;

 class Fileh {
    public static void main(String[] args) {
        try {
            Fileh fh = new Fileh("C:\\Users\\Nayan Acharya\\Desktop\\test.txt");
            try {
                fh.write("Java file handling");
            } finally {
                fh.close();
            }
            System.out.println("File created");

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
