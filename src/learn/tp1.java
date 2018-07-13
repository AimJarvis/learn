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

public class tp1
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        long n=x.nextLong();
        
        if(n==0)
        {
            System.out.print(1); 
         
        }
     
        else  if(n%4==2)
        {
            System.out.print(4);            
        }
        else if(n%4==3)
        {
            System.out.print(2);            
        }
        else if(n%4==1)
        {
            System.out.print(8);            
        }  
        else if(n%4==0)
        {
            System.out.print(6);            
        }  
            
    }
}
