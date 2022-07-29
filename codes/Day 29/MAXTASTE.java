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
		int testCase, A, B, C, D;
		
		
	Scanner sc = new Scanner(System.in);
	
	testCase = sc.nextInt();
	
	while(testCase > 0){
	    
	   A = sc.nextInt();
	   B = sc.nextInt();
	   C = sc.nextInt();
	   D = sc.nextInt();
	   
	   if(A>=B && C>=D){
	       System.out.println(A+C);
	   }
	   else if(A>=B && C<=D){
	       System.out.println(A+D);
	   }
	   else if(A<=B && C>=D){
	       System.out.println(B+C);
	   }
	   else if(A<=B && C<=D){
	       System.out.println(B+D);
	   }
	   
	   testCase --;
	}
	}
}
