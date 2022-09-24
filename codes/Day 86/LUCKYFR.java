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
		int testCase, lines;
		
		Scanner sc = new Scanner(System.in);
		
		testCase = sc.nextInt();
		
		while(testCase -- > 0){
		    
		    int count = 0;
		    
		    lines = sc.nextInt();
		    
		    while(lines > 0){
		        if(lines % 10 == 4){
		            count++;
		        }
		        lines = lines / 10;
		    }
		    
		    System.out.println(count);
		    
		}
	}
}
