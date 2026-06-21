package LabQuestions;
import java.util.Scanner;
public class domainname
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String email;

        System.out.println("Enter email address:");
        email = sc.nextLine();

        String arr[] = email.split("@");

        System.out.println("Domain name is " + arr[1]);
    }
}



