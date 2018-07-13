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
import static java.lang.Integer.*;
public class shift 
{
    public static void main(String args[])
    {
        char lA='A';
        char lB='B';
        char lC='C';
        char lD='D';
        
        long packed=0L;
        packed= lD;
        System.out.println(" "+packed+"  0x"+ toHexString((int) packed));
        packed=(packed<<16)|lC;
        System.out.println(" "+packed+"  0x"+ toHexString((int) packed));
                packed=(packed<<16)|lB;
        System.out.println(" "+packed+"  0x"+ toHexString((int) packed));
                packed=(packed<<16)|lA;
        System.out.println(" "+packed+"  0x"+ toHexString((int) packed));
               
        System.out.println("packed now contains 0x"+toHexString((int) packed));
        long mask=0xFFFF;
        
        char letter=(char)(packed&mask);
        System.out.println("From Right to left Letters Are : ");
        System.out.println(" "+letter+"  0x"+ toHexString(letter));
        packed>>=16;
        letter=(char)(packed&mask);
        System.out.println(" "+letter+"  0x"+ toHexString(letter));
        packed>>=16;
        letter=(char)(packed&mask);
        System.out.println(" "+letter+"  0x"+ toHexString(letter));
        packed>>=16;
        letter=(char)(packed&mask);
        System.out.println(" "+letter+"  0x"+ toHexString(letter));
        
    }
}
