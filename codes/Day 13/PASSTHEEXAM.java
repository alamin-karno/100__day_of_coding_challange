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
		
		while(testCase >0){
		    A = sc.nextInt();
		    B = sc.nextInt();
		    C = sc.nextInt();
		    
		    if(A < 10 || B < 10 || C < 10){
		        System.out.println("FAIL");
		    }
		    else if((A+B+C) < 100){
		        System.out.println("FAIL");
		    }
		    else{
		        System.out.println("PASS");
		    }
		    
		    testCase --;
		}
	}
}
