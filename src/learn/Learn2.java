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
public class Learn2 {
    private int hh;
        
        private int mm;
       private int ss;
    public static void main(String args[])
    {
        Learn2 obj=new Learn2(10,55,14);
    }
  Learn2(int h,int m,int s)
    {
       hh=h;
       mm=m;
       ss=s;
        System.out.printf("Time is %s ",this);
    }
   public String toString()
   {
       return String.format("%d/%d/%d", hh,mm,ss);
   }
}
