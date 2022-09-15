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
		int testCase;
		double aliceHome, aliceTime, bobHome, bobTime;
		
		Scanner sc = new Scanner(System.in);
		
		testCase = sc.nextInt();
		
		while(testCase -- > 0){
		    aliceHome = sc.nextInt();
		    
		    aliceTime = sc.nextInt();
		    
		    bobHome = sc.nextInt();
		    
		    bobTime = sc.nextInt();
		    
		    if((aliceHome / aliceTime) > (bobHome / bobTime)){
		        System.out.println("Alice");
		    }else if((aliceHome / aliceTime) < (bobHome / bobTime)){
		        System.out.println("Bob");
		    }
		    else if((aliceHome / aliceTime) == (bobHome / bobTime)){
		        System.out.println("Equal");
		    }
		}
	}
}
