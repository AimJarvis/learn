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
// Java program to demonstrate working of split(regex,
// limit) with negative limit.
public class Split
{
    public static void main(String args[])
    {
        String str = "geekss@for@geekss";
        String [] arrOfStr = str.split("@", 2);
 
        for (String a : arrOfStr)
            System.out.println(a);
    }
}
