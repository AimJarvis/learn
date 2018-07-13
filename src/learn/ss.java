/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn;

/**
 *
 * @author Umesh
 */
import java.util.*;

class ss 
{
    public static void main(String args[])
    {
         Scanner x=new Scanner(System.in);
         String y=x.nextLine();
         String z=x.nextLine();
         int a=y.length();
         int b=z.length();
         
         if(y.equalsIgnoreCase(z))
             System.out.println(0);
         else if(a<b)
             System.out.println(-1);
         else 
             System.out.println(1);
             
             
    }
}

        