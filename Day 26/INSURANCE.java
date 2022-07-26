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
		int testCase, damage, repair;
		
		Scanner sc = new Scanner(System.in);
		
		testCase = sc.nextInt();
		
		while(testCase > 0){
		    damage = sc.nextInt();
		    
		    repair = sc.nextInt();
		    
		    if(repair <= damage){
		        System.out.println(repair);
		    }
		    else{
		        System.out.println(damage);
		    }
		    
		    testCase --;
		}
	}
}
