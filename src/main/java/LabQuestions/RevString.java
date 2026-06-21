package LabQuestions;

import java.util.Scanner;

public class RevString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String og;
        System.out.println("enter any string to reverse it ");
        og=sc.nextLine();
        StringBuffer s = new StringBuffer(og);
        s.reverse();
        System.out.println("before reversed " + og);
        System.out.println("Reverse is " + s);



    }
}
