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
		int testCase, easy, hard, total;
		
		Scanner sc = new Scanner(System.in);
		
		testCase = sc.nextInt();
		
		while(testCase -- > 0){
		    total = sc.nextInt();
		    easy = sc.nextInt();
		    hard = sc.nextInt();
		    
		    if(total <= (easy + (hard * 2))){
		        System.out.println("Qualify");
		    }else{
		        System.out.println("NotQualify");
		    }
		}
	}
}
