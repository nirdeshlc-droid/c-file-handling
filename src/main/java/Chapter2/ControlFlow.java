package Chapter2;

import java.util.Scanner;

public class ControlFlow
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
         String c;
         System.out.println("enter first alph to find day");
         c=sc.nextLine();
          switch (c)
          {
              case "s" : System.out.println("its sunday");
              break;
              case "m" : System.out.println("its monday");
                  break;
              case "t" : System.out.println("its tuesday");
                  break;
              case "w" : System.out.println("its wednesday");
                  break;
              case "th" : System.out.println("its thursday");
                  break;
              case "fr" : System.out.println("its friday");
                  break;
              case "sa" : System.out.println("its saturday");
                  break;
              default: System.out.println("Number must be 1-7");
          }
    }

}
