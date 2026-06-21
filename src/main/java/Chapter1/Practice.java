package Chapter1;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,f=1;
        System.out.println("enter number");
        a=sc.nextInt();
        if (a<0)
        {
            System.out.println("factorial of -ve number does not exist");
        }
        else if (a==0)
        {
            System.out.println("Factorial is 1");
        }
        else
            for (int i=1;i<=a;i++)
            {
                f=f*i;
            }
            System.out.println("Factorial is " + f);


    }



}
