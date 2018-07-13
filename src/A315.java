/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Umesh
 */
import java.util.*;
public class A315 
{
 public static void main(String args[])
 {
     
     Scanner obj=new Scanner(System.in);
     int x=obj.nextInt();
     int k=0,i,j;
     int a[]=new int[x];
     int b[]=new int[x];
     for( i=0;i<x;i++)
     {
         a[i]=obj.nextInt();
         b[i]=obj.nextInt();
     }
    
     for(i=0;i<x;i++)
    {
        for(j=0;j<x;j++)
        {
            if(a[i]==b[j]&&i!=j)
                break;
        }
        if(j==x)
            k++;
    }
    System.out.println(k);
     
 }
}
