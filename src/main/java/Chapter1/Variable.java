package Chapter1;

import java.math.BigInteger;
import java.util.Scanner;

public class Variable
{
    public  static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name, address , gender;
        int age;
        BigInteger contact;
        System.out.println("enter name");
        name = sc.nextLine();
        System.out.println("enter address");
        address= sc.nextLine();
        System.out.println("enter gender");
        gender=sc.nextLine();
        System.out.println("enter age");
        age=sc.nextInt();
        System.out.println("enter contact detail");
        contact= sc.nextBigInteger();

        System.out.println("Your personal Details...");
        System.out.println("Name :" + name);
        System.out.println("Address :" + address);
        System.out.println("Gender :" + gender);
        System.out.println("Age :" + age);
        System.out.println("Contact :" + contact);


    }


}
