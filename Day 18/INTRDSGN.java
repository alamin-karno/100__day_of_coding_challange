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
		int testCase, x1, x2, y1, y2;
		
		Scanner sc = new Scanner(System.in);
		
		
		testCase = sc.nextInt();
		
		while(testCase > 0 ){
		    
		    x1 = sc.nextInt();
		    y1 = sc.nextInt();
		    x2 = sc.nextInt();
		    y2 = sc.nextInt();
		    
		    if((x1+y1) >= (x2+y2)){
		        
		         System.out.println((x2+y2));
		    }else{
		       System.out.println((x1+y1));
		    }
		    
		    testCase --;
		}
	}
}
