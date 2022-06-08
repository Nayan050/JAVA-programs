public class sttudent {
    String name;
    int rollno;

    public static void main(String args[]) {
        student s = new student();
        s.name = "Nayan Acharya";
        s.rollno = 12;
        System.out.println("The roll no. of " + s.name + " is " + s.rollno + ".");
    }
}