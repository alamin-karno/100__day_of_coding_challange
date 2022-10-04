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
		int testCase, offerA, offerB;
		
		Scanner sc = new Scanner(System.in);
		
		testCase = sc.nextInt();
		
		while(testCase -- > 0){
		    offerA = sc.nextInt();
		    
		    offerB = sc.nextInt();
		    
		    if((offerA*100)/10 > (offerB*100)/20){
		        System.out.println("FIRST");
		    }else if((offerA*100)/10 < (offerB*100)/20){
		        System.out.println("SECOND");
		    }else if((offerA*100)/10 == (offerB*100)/20){
		        System.out.println("ANY");
		    }
		}
	}
}
