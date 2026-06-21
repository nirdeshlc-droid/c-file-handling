package LabQuestions;

import java.util.Scanner;

public class GradeCalc
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m;
        System.out.println("Enter marks to calculater grade");
        m= sc.nextInt();
        if(m>=80)
        {
            System.out.println("Grade is A");
        }
        else if(m>=60)
        {
            System.out.println("Grade is B");
        }
        else if(m>=40)
        {
            System.out.println("Grade is C");
        }
        else if(m<40)
        {
            System.out.println("Grade is F");
        }
          else if(m>100 && m<0)
        {
            System.out.println(" invalid marks");
        }
    }
}
