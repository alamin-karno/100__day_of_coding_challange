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
		int testCase, having, capacity, rate, hours;
		
		Scanner sc = new Scanner(System.in);
		
		testCase = sc.nextInt();
		
		while(testCase -- > 0){
		    
		    having = sc.nextInt();
		    capacity = sc.nextInt();
		    rate = sc.nextInt();
		    hours = sc.nextInt();
		    
		    int remainCapacity = capacity - having;
		    
		    if(remainCapacity == (rate*hours)){
		        System.out.println("filled");
		    }
		    else if(remainCapacity < (rate*hours)){
		        System.out.println("overFlow");
		    }
		    else if(remainCapacity > (rate*hours)){
		        System.out.println("Unfilled");
		    }
		}
	}
}
