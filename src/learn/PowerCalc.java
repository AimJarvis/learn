/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn;
import java.util.*;
public class PowerCalc 
{ 
    static double powerr(double x, int n) 
    {
        if(n > 1) 
          return x*powerr(x, n-1);
         
if(n < 0) 
return 1.0/powerr(x, -n);         // Negative power of x 
else
return n == 0 ? 1.0 : x;         // When n is 0 return 1, otherwise x
}
 
    public static void main(String[] args) 
{
    double x = 5.0;
    System.out.println( powerr(x,4));
    System.out.println( powerr(7.5,5));
    System.out.println("7.5 to the power 0 is"+ powerr(7.5,0));
    System.out.println( powerr(10,-2)); 
    System.out.println(powerr(2,5));
}
    
    //It is a method that the Garbage Collector always calls just before the deletion/destroying the object which is eligible for Garbage Collection, so as to perform clean-up activity. 
   // Clean-up activity means closing the resources associated with that object like Database Connection, Network Connection or we can say resource de-allocation. 
    //Remember it is not a reserved keyword.
}