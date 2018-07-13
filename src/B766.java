
import java.util.Arrays;
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
public class B766
{
        public static void main(String args[])
        {
                    Scanner obj=new Scanner(System.in);
                    int n=obj.nextInt();
                    int[] a=new int[n];
                    int flag=0;
                    for(int i=0;i<n;i++)
                     a[i]=obj.nextInt(); 
                    Arrays.sort(a);
                    for (int str : a) {
	System.out.println(a);
}
                     for(int i=2;i<n;i++)
                     {
                         if(a[i-1]+a[i-2]>a[i])
                             System.out.println("YES");
                             flag=1;
                     }
                     
                     if(flag==0)
                     System.out.println("NO");
           
        }

}
