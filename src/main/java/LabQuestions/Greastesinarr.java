package LabQuestions;

import java.util.Scanner;

public class Greastesinarr
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[10];
        for (int i=0;i<10;i++)
        {
            System.out.println("enter numbers ");
            num[i]=sc.nextInt();
        }
        int g=num[0];
        for(int i=0;i<10;i++)
        {
            if(num[i]>g)
            {
                g=num[i];
            }
        }
        System.out.println("Greastest number in array is " + g);

    }

}
