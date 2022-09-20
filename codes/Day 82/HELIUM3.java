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
		int testCase, unit, years, grams, unitB;
		
		Scanner sc = new Scanner(System.in);
		
		testCase = sc.nextInt();
		
		while(testCase -- > 0){
		    unit = sc.nextInt();
		    
		    years = sc.nextInt();
		    
		    grams = sc.nextInt();
		    
		    unitB = sc.nextInt();
		    
		    
		    if((unit * years) <= (grams * unitB)){
		        System.out.println("Yes");
		    }else{
		        System.out.println("No");
		    }
		}
	}
}
