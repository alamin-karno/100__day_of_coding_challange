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
		int testCase, length, width, cost;
		
		Scanner sc = new Scanner(System.in);
		
		testCase = sc.nextInt();
		
		while(testCase -- > 0){
		    length = sc.nextInt();
		    
		    width = sc.nextInt();
		    
		    cost = sc.nextInt();
		    
		    
		    System.out.println(((length * 2) + (width * 2)) * cost);
		}
	}
}
