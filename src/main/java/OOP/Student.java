package OOP;

public class Student
{
    int rollno;
    String name;
    String address;
    static String collegename="Swyambhu intl college";

    public void read()
    {
        System.out.println("Student study java");
    }
     public void payFee()
     {
         System.out.println("student pay college fee");
     }
     public void play()
     {
         System.out.println("Play Football");
     }

     public static void main(String[] args)
     {
         Student s1;
         s1 = new Student();

         s1.read();
         s1
     }
}
