
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
// 3 1  4 3
// 2     2
public class B570
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
      int n = input.nextInt() , m=input.nextInt();
    if(n==1)
        System.out.println(1);
    else 
        System.out.println((m-1 >= n-m)? m-1: m+1);
    }
}
