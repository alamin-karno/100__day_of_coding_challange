/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int testCase, firstTV, secondTV, flatDiscount1, flatDiscount2;
		
	    Scanner sc = new Scanner(System.in);
	    
	    testCase = sc.nextInt();
	    
	    while(testCase > 0){
	        firstTV = sc.nextInt();
	        secondTV = sc.nextInt();
	        
	        flatDiscount1 = sc.nextInt();
	        flatDiscount2 = sc.nextInt();
	        
	        if((firstTV - flatDiscount1) < (secondTV - flatDiscount2)){
	            System.out.println("First");
	        }else if((firstTV - flatDiscount1) > (secondTV - flatDiscount2)){
	            System.out.println("Second");
	        }else{
	            System.out.println("Any");
	        }
	        
	        testCase --;
	    }
	}
}
