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
public class A637 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        long a[]=new long[1000000];
        long[] hash=new long[10000];
        for(int i=0;i<n;i++)
        { 
             a[i]=s.nextLong();
            //hash[a[i]]++;
        }
    }
}
