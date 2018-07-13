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

public class Breakgoto 
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        
        int x=obj.nextInt();
        int y=obj.nextInt();
        
        outer:  for(int i=0;i<5;i++)
        {
            inner:      for(int j=0;j<5;j++)
                {
                       System.out.println(" "+i*j);
                }
            
            System.out.println(" ");
        }
    }
}
