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

public class tp2
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int x=obj.nextInt();
        int a[]=new int[n];
            int i,j,k=0,l=0;
       for( i=0;i<n;i++ )
       {
           a[i]=obj.nextInt();
       }
       
       for( i=0;i<n-1;i++ )
       {
           for( j=i+1;j<n&&i!=j;j++ )
        {
            l=a[i]^a[j];
         if(l==x)
             k++;
        }
       }

       
       System.out.print(""+k);   
       
    }
}
