
package factorialrecursion;

import java.util.Scanner;


public class FactorialRecursion {

    
    public static void main(String[] args)
    {
        
        
        System.out.println(Factorial(20));
    }
    
     public static int Factorial(int n)
     {
         if(n==1)
         {
             return 1;
         }
         else
         {
             return n*Factorial(n-1);
         }
     }
}
