package Chapter1;

import java.util.Scanner;

public class project
{
    public static void main(String[] args)
    {
//        Scanner sc = new Scanner(System.in);
//        int x;
//        System.out.println("enter value");
//        x=sc.nextInt();
//        float f=x;
//
//        System.out.println("enter another value");
//        double d =sc.nextInt();
//        long y=(long)d;
//        System.out.println("value of x =" + f);
//        System.out.println(y);

 Scanner sc = new Scanner(System.in);
// int x;
// System.out.println("enter any number ");
// x=sc.nextInt();
// if (x%2==0)
// {
//     System.out.println("Its even number");
// }
// else
// {
//     System.out.println("its odd number");
// }

        String weather;
        System.out.println("Enter weather");
        weather=sc.nextLine();
        if(weather .equals("sunny"))
        {
            System.out.println("We will rest in the beach");
        }
        else if (weather .equals("cloudy"))
        {
            System.out.println("We will go for camping");
        } else if (weather .equals("rainy"))
        {
            System.out.println("We will rest in the bed");
        }
        else
        {
            System.out.println("We dont care");
        }


    }
}
