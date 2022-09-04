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
		int testCase, bill;
		
	    Scanner sc = new Scanner(System.in);
	    
	    testCase = sc.nextInt();
	    
	    while(testCase -- > 0){
	        bill = sc.nextInt();
	        
	        int discount = (int) bill * 10 / 100;
	        
	        if(100 >= discount){
	            System.out.println(100);
	        }else{
	            System.out.println(discount);
	        }
	    }
	}
}
