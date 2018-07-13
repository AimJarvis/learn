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
import java.lang.AssertionError;
public class Assert
{
    public static void main(String args[])
    {
        Scanner o=new Scanner(System.in);
        int x=o.nextInt();
        
        if(x%2==0)
            System.out.print("Divide by 2");
        else
            assert false: "Fals e hi hi"+x;
    }
}
