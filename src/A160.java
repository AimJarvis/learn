
import java.util.Arrays;
import java.util.Scanner;

public class A160 
{
     public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0,k=0,ctr=0,temp=0;
        int a[]=new int[100];
        for(int i=0;i<n;i++)
        { 
             a[i]=s.nextInt();
             sum=sum+a[i];
        }
       /* for(int i=0;i<n;i++)
        { 
            System.out.println(a[i]);
        }*/
     // Arrays.sort(a);
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
      for(int i=0;i<n;i++)
        { 
            System.out.println(a[i]);
        }
        for(int i=n-1;i>=0;i--)
        {
            if(sum/2>=k)
            {
                k=k+a[i];
                ctr++;
            }
            else break;
                
                
        }
        System.out.println(ctr);
    }
}
/*
{
	int n;
	cin>>n;
	int a[n],sum=0,s1=0,p;
	for(int i=0;i<n;i++){
        cin>>a[i];
        sum+=a[i];
	}

    sort(a,a+n);
    int c=0;
    for(int i=n-1;i>=0;i--){

        if(sum/2>=s1){
            s1+=a[i];
            c++;
        }
        else break;
    }

    cout<<c;
	return 0;

}*/