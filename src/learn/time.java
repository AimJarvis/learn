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
import java.text.*;

public class time
{
     public static void main(String args[])
     {
        Date date=new Date();
        System.out.println(date.toString());
        
  SimpleDateFormat ft = new SimpleDateFormat( "E yyyy.MM.dd 'at' hh:mm:ss a zzz");

      System.out.println("Current Date: " + ft.format(date));     }
}
