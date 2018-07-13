
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int x;
        int[] a = new int[n];
        for(int i=0; i < n; i++){
            a[i] = in.nextInt();
        }
        
        /*for(int i=0; i < n; i++){
            x=i+k;
            if(i+k>=n)
                a[i]=a[x%n];
            a[i]=a[i]
        }*/
        for(int i = 0; i< q; i++)
        {
            int m = in.nextInt();
            x=m+k-1;
            if(x>=n)
                x=x%n;
            
           System.out.println(a[x]);
        }
    }
}
