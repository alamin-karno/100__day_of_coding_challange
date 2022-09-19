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
		int testCase, A, B, C;
		
		Scanner sc = new Scanner(System.in);
		
		testCase = sc.nextInt();
		
	    while(testCase -- > 0){
	        A = sc.nextInt();
	        
	        B = sc.nextInt();
	        
	        C = sc.nextInt();
	        
	        
	        if((A+B)/2 < 35){
	            System.out.println("Fail");
	        }
	        else if((B+C)/2 < 35){
	            System.out.println("Fail");
	        }
	        else if((A+C)/2 < 35){
	            System.out.println("Fail");
	        }
	        else{
	            System.out.println("Pass");
	        }
	    }
	    
	}
}
