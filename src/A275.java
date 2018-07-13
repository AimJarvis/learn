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

public class A275 
{
    public static void main(String args[])
    { 
        
       Scanner obj=new Scanner(System.in);
       int k;
       int a[][]=new int[5][5]; 
       for(int i=0;i<5;i++)
       {
            for(int j=0;i<5;i++)
            {
              a[i][j]=0;
            }
       }
       for(int i=1;i<=3;i++)
       {
            for(int j=1;i<=3;i++)
            {
              a[i][j]=obj.nextInt();
            }
       }
        for(int i=1;i<=3;i++)
       {
            for(int j=1;j<=3;j++)
            {
             
            
              System.out.print((a[i][j]+a[i][j-1]+a[i][j+1]+a[i-1][j]+a[i+1][j]+1)%2);
            }
            System.out.println();
       }
    }
}

/*int main()
{
  
    ll a[5][5]={0};
    ll b[3][3];
    for(i=1;i<=3;i++)
    {
        for(j=1;j<=3;j++)
            cin>>a[i][j];
    }
    for(i=1;i<=3;i++)
    {
        for(j=1;j<=3;j++)
        {
            cout<<(a[i][j]+a[i][j-1]+a[i][j+1]+a[i-1][j]+a[i+1][j]+1)%2;
        }
        cout<<endl;
    }
    return 0;
}

*/