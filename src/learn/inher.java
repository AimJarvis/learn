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
public class inher
{
     int a=5;
     void mul()
     {
         a=a*a;
         System.out.println("Superclass Inher");
     }
}
class B extends inher
{
    
    void mul()
    {
        a=a*10;
          System.out.println("Subclass B");

    }
    void dis()
    {
        B obj=new B();
        obj.mul();
      super.mul();
     System.out.println( obj.a);
          System.out.println( super.a);

    }
   
    public static void main(String args[])
    {
        B obj2=new B();
        obj2.dis();
    }
}


