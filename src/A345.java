
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Umesh
 */
public class A345 
{
    public static void main(String args[])
    {
         Scanner input = new Scanner(System.in);
         String x=input.nextLine();
         double y=input.nextDouble();
         int c=0,d=0,e=0;
         for(int i=0;i<x.length();i++)
         {
             if(x.charAt(i)=='1')
                 c++;
             else if(x.charAt(i)=='0')
                 d++;
             else
                 e++;
         }
           if(d==0)
            System.out.println(1.00000);
           else if(c==0)
               System.out.println(0.00000);
           DecimalFormat five = new DecimalFormat("#0.00000");
         System.out.println(five.format((c*y+d*(1-y))/x.length()));
    }
}
