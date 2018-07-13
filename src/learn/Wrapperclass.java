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
//Wrapper classes are used to convert any data type into an object. 
//The primitive data types are not objects; they do not belong to any class; they are defined in the language itself.
//Sometimes, it is required to convert data types into objects in Java language.
//Autoboxing: Converting a primitive value into an object of the corresponding wrapper class is called autoboxing. 
        //For example, converting int to Integer class
//Unboxing: Converting an object of a wrapper type to its corresponding primitive value is called unboxing.
//wrapper classes are immutable: Boolean, Byte, Character, Double, Float, Integer, Long, Short, String.
public class Wrapperclass 
{
     public static void main (String[] args)
    {
        // creating an Integer Object
        // with value 10.
        Integer i = new Integer(10);
 
        // unboxing the Object
        int i1 = i;
 
        System.out.println("Value of i: " + i);
        System.out.println("Value of i1: " + i1);
 
        //Autoboxing of char
        Character gfg = 'a';
 
        // Auto-unboxing of Character
        char ch = gfg;
        System.out.println("Value of ch: " + ch);
        System.out.println("Value of gfg: " + gfg);
 
    }
}


