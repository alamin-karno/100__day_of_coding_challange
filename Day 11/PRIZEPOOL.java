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
		int testCase, topRankers, otherRankers;
		
		Scanner sc = new Scanner(System.in);
		
		testCase = sc.nextInt();
		
		while(testCase > 0){
		    topRankers = sc.nextInt();
		    
		    otherRankers = sc.nextInt();
		    
		    System.out.println((topRankers * 10) + (otherRankers * 90));
		    
		    testCase --;
		}
	}
}
