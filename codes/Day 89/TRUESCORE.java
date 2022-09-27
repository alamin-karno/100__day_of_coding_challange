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
		int testCase, a, b, c , d;
		
		Scanner sc = new Scanner(System.in);
		
		testCase = sc.nextInt();
		
		while(testCase -- > 0){
		    
		    a = sc.nextInt();
		    b = sc.nextInt();
		    c = sc.nextInt();
		    d = sc.nextInt();
		    
		    if(a <= c && b <= d){
		        System.out.println("POSSIBLE");
		    }else{
		        System.out.println("IMPOSSIBLE");
		    }
		}
	}
}
