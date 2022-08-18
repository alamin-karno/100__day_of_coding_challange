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
		int testCase, totalrupee;
		
		Scanner sc = new Scanner(System.in);
		
		testCase = sc.nextInt();
		
		while(testCase > 0){
		    
		    totalrupee = sc.nextInt();
		    
		    if(totalrupee <= 100){
		        System.out.println(totalrupee);
		    }
		    else if(totalrupee > 100 && totalrupee <= 1000){
		        System.out.println(totalrupee - 25);
		    }
		    else if(totalrupee > 1000 && totalrupee <= 5000){
		        System.out.println(totalrupee - 100);
		    }
		    else if(totalrupee > 5000){
		        System.out.println(totalrupee - 500);
		    }
		    
		    testCase --;
		}
	}
}
