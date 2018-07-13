/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Umesh
 */
import java.util.Arrays;
import java.util.Scanner;

public class A777
{
     public static void main(String args[])
    {
         Scanner input = new Scanner(System.in);
        int x=input.nextInt();
        int y=input.nextInt();
        int[] a=new int[3];
        int temp=0;
        Arrays.fill(a, 0);
        
        a[y]=1;
        if(x==y)
        {
             System.out.println(0); return;
        }
           
         for(int i=x;i>0;i--)
         {
		if(i%2==0)
                {
                  temp=a[1]  ;
                  a[1]=a[2];
                  a[2]=temp;
                }
		
		else
                {
                  temp=a[0]  ;
                  a[0]=a[1];
                  a[1]=temp;       
                }
         }
         
         if(a[0]==1)
             System.out.println(0);
         else if (a[1]==1)
             System.out.println(1);
         else
             System.out.println(2);
    }
}
