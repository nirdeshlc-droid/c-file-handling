package Chapter2;

import java.util.Scanner;

public class Nestedif
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int n;
        System.out.println("enter any number");
        n=sc.nextInt();
        if(n%5==0)
        {
            if(n%3==0)
            {
                System.out.println("this number is divided by both 3 and 5");
            }
            else {
                System.out.println("its only divided by 3");
            }
        }
        else {
            System.out.println("its neither divided by 5 nor 3");
        }
    }
}

