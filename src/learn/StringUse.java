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
import java.lang.*;
public class StringUse
{
    public static void main(String args[])
    {
        String s1="Alan ";
        String s2="Walker";
        String s3="Alan Walker";
      String s4=s1+s2; // string 1 & string 2 refers to separate string ojects.
        //if(s4.equals(s3)) o/p is equals strings where as for s1==s3 o/p is not equals strings
        if(s4==s3)   // s1+s2.intern() this will make strings equals when checked by = operator.
        {           // what intern do?  If two String variables reference strings that are identical, the references must be identical, too. To put it another way, if two String variables contain references that are not equal, they must refer to strings that are different. 
            System.out.println("Equal strings");
            
        }
        else
        {
            System.out.println("Not Equal strings");
        }
       
        s1=s3; // both string refers to same string object.
        if(s1==s3)
        {
            System.out.println("Equal strings");
        }
        else
        {
            System.out.println("Not Equal strings");
        }
        
        int in=s3.indexOf('a',5);  // checks a after index 5
        int in2=s3.lastIndexOf('a');
        System.out.println(in);
        
        
        StringBuffer x1 =new StringBuffer("Hello");
        System.out.println(""+x1.append(s4));
    }
}

/* String s1="This is where we Fight!!!!";
s1.equals(s2);// 
s1.startsWith("This");
s1.endsWith("!");
s1.compareTo(s2);   s1>s2 return 1
                    s2>s1 return -1
                    s1==s2 return 0
s1.charAt(index);

char ch=Character.toLowerCase(s1.charAt(i));   // Character is a class

char ch;
if(Character.isLetter(ch)) // Checks  for Letters

if(Character.isWhitespace(ch))  // Checks for Spaces 

int in=s1.indexOf('a'); // Returns index of first a it encounters

int in=s1.indexOf('a',yeh);  // Searches for a after yeh word



String newText = text.replace(‘ ‘, ‘/’);

// String x=name.substring(2,2); // returns sh (Umesh)

// Converting string to char array
  String text="Hello Sample Program";
  char[] x=text.toCharArray();

// Converting char array to string 
char[] text={'a','b','c','d'};
String x=String.copyValueof(text);
or 
String x=new String(text);
or
String x=String.copyValueof(text,1,1);// b

  String text="Hello Sample Program";
  char[] x=text.toCharArray();


String text = “to be or not to be, that is the question.”;
String[] words = text.split(“[, .]”, 0);  // Delimiters are comma, space, or period
***************
String Buffer : String that can be changed according to will
(Mutable string)

StringBuffer x =new StringBuffer("Hello");

x.setLength(100);// change the length of String
x.ensureCapacity(10); // changes default size
int z=x.capacity(); // returns defalut size

x.append(" Ola Oli ");

x.append("Shano").append("Babi").append("Chhandi the ran").append("Bikku Boy");

x.append(y,3,5)
x.insert(4,"nice");
x.setCharAt(3,'z');
x.deleteCharAt(2,'z');
x.reverse();

//StringBuilder
*/