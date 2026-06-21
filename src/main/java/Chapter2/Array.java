package Chapter2;

import java.util.Scanner;

public class Array
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] agelist = new int[6];
//        for (int i = 0; i < agelist.length; i++) {
//            System.out.println("Enter age of student");
//            agelist[i] = sc.nextInt();
//        }
//        System.out.println("Ages of student in given order");a
//        for (int i = 0; i < agelist.length; i++) {
//            System.out.println(agelist[i]);
//        }

        int [] n = new int[10];
        int sum=0;
        for(int i=0 ; i< n.length;i++)
        {
            System.out.println("Enter any natural number ");
            n[i]= sc.nextInt();
            sum+=n[i];

        }

        System.out.println("Total sum is " + sum);

    }
}
