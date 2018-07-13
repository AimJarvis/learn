
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
public class A747
{
     public static void main(String args[])
    {
         Scanner input = new Scanner(System.in);
        int x=input.nextInt();
        int m=0,n=0;
        for(int i=1;i<=Math.sqrt(x);i++)
        {
            if(x%i==0)
            {
                   m=i; n=x/i;
            }
        }
        System.out.println(n+" "+m);
    }
}
