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
import java.util.Arrays;
import java.util.Scanner;

class array
{
    public static void main(String args[]) 
   {
       
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt(); 
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=obj.nextInt();
        }
      /* 
        for(int i=0;i<10;i++)
        {
            System.out.println(a[i]);
        }*/
        for(int element : a)
        {
            System.out.println(element);
        }
       // System.out.println(new int[]{1,5,4,5,1});
       reverse(a);
       Arrays.sort(a);
       for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
    // Arrays.sort(arr, Collections.reverseOrder());  
    // Arrays.sort(arr, 1, 5);
    public static void reverse(int[] b)
    {
       int a[]=new int[b.length];
        int result[]=new int[b.length];
        for(int i=0,j=b.length-1;i<b.length;i++,j--)
        {
            result[j]=b[i];
        }
        for(int i=0;i<b.length;i++)
        {
            System.out.println(result[i]);
        }
        java.util.Arrays.fill(result,1);
        for(int i=0;i<b.length;i++)
        {
            System.out.println(result[i]);
        }
        
        System.out.println(""+a);
    } 
}
