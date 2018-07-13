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
import java.util.Random;
import java.util.Scanner;
public class cf584A 
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        
        int x=obj.nextInt();
        int y=obj.nextInt();
        int z;
        
        if(y!=10)
        {
            for(int i=x;i>0;i--)
          {
                System.out.print(y);
              
           }
        }
       
        else
        if(x==1)
        System.out.print(-1);
        else
        {
               System.out.println(1);
                for(int i=0;i<x-1;i++)
        System.out.print(0);
        }
       return ;
    }
}