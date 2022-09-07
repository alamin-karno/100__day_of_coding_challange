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
		int testCase, friends, subscriptionFee;
		
		Scanner sc = new Scanner(System.in);
		
		testCase = sc.nextInt();
		
		while(testCase -- > 0){
		    friends = sc.nextInt();
		    subscriptionFee = sc.nextInt();
		    
		    if(friends % 6 == 0){
		        System.out.println(subscriptionFee * (friends / 6));
		    }else{
		        System.out.println(subscriptionFee * ((friends / 6) + 1));
		    }
		}
		
	}
}
