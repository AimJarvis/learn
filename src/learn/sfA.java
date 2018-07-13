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
import java.util.Scanner;

public class sfA 
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int k=x.nextInt();
        int time=k,i,flag=0;
        for( i=1;i<=n;i++)
        {        
             time=time+5*i;
            if(time>240)
            {
                 flag=1;
                 break ;
                
            }               
            if(flag==1)
                break;
        }
         System.out.println(--i);
    }
}

