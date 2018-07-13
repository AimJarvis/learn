/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Umesh
 */
import java.util.Scanner;

public class B758 
{   
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String x=obj.nextLine();
       /* int p=0,ctr=0;
        for(int i=0;i<x.length();i++)
        {
            if(x.charAt(i)=='R')
            {
                p=i%4;
                break;
            }         
        }
        for(int i=p;i<x.length();i=i+4)
        {
            if(x.charAt(i)=='!')
            ctr+;         
            
        }
        */
            
        
  System.out.println(" "+check('R',x)+" "+check('B',x)+" "+check('Y',x)+" "+check('G',x));
    }
    
   public static  int check(char c,String x)
      {
          int  p=0,ctr=0;
      
      for(int i=0;i<x.length();i++)
        {  
            if(x.charAt(i)==c)
                p=i%4;               
                   break;  
        }
    
        for(int i=p;i<x.length();i=i+4)
        {
            if(x.charAt(i)=='!')
            ctr++;         
        }
    System.out.println(ctr);
          return ctr;
          
      }
}
