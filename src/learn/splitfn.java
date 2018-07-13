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
public class splitfn 
{
    public static void main(String args[])
    {
        String text="To be to be not, This is where we fight ";
        String delimiters="[, .]";
        int[] limits={0,-1};
        // -1 gives a space after spliting all words
        // 0 does not  (0 is used as a default)
         
        for(int limit: limits)
        {
            System.out.println("With Limit : "+limit);
            String[] tokens=text.split(delimiters,limit);
            System.out.println("No of tokens: "+ tokens.length);
            
            for(String token : tokens)
            {
                System.out.println(token);
            }
        }
      
    }
}
