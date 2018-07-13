/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Umesh
 */

import java.util.Scanner;

public class A810 {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        int k = x.nextInt();
        int sum = 0;
        double marks = 0;
        int count = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) 
        {
        a[i] = x.nextInt();
        sum+=a[i];
        marks = (double) sum / n;
     
        }
        while (marks != k) 
        {
            if((marks * 10) % 10 >= 5)
            {
                
                marks =  Math.ceil(marks); System.out.println(marks);
                continue;
            }
            sum+=k;
            n++;
            marks = (double) sum / n;
            count++;
        }
       
        System.out.println(count);
    }
}