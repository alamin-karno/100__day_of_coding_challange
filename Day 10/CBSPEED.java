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
		int thresholdLimit, ChefLimit;
		
		Scanner sc = new Scanner(System.in);
		
		thresholdLimit = sc.nextInt();
		
		ChefLimit = sc.nextInt();
		
		if(thresholdLimit >= ChefLimit){
		    System.out.println("NO");
		}
		else{
		    System.out.println("YES");
		}
		
		
	}
}
