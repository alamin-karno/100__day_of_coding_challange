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
		int testCase, totalPeople;
		
		Scanner sc = new Scanner(System.in);
		
		testCase = sc.nextInt();
		
		while(testCase -- > 0){
		    totalPeople = sc.nextInt();
		    
		    if(totalPeople % 4 == 0){
		        System.out.println(totalPeople/4);
		    }
		    else{
		        System.out.println((totalPeople/4) + 1);
		    }
		}
	}
}