package LabQuestions;

import java.util.Scanner;

public class Calcswitch
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int a,b,r;
        int op;
        System.out.println("enter two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("enter operatoe (1-4)");
        System.out.println("1-add, 2-sub, 3-mult, 4-div");
        op=sc.nextInt();
        switch (op)
        {
            case 1 : r=a+b;
            System.out.println("Sum is " + r);
            break;

            case 2 : r=a-b;
                System.out.println( " Difference is " + r);
                break;

            case 3 : r=a*b;
                System.out.println("Product is is " + r);
                break;

            case 4 :
                if(b==0)
                {
                    System.out.println(" Error ");
                }
                else {
                    r= a/b;
                    System.out.println("Division is " + r);
                    break;
                }

            default:
                System.out.println(" Invalid operator");

        }

    }
}
