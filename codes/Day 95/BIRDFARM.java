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
		int testCase, chicken, duck, legs;
		
		Scanner sc = new Scanner(System.in);
		
		testCase = sc.nextInt();
		
		while(testCase -- > 0){
		    chicken = sc.nextInt();
		    duck = sc.nextInt();
		    legs = sc.nextInt();
		    
		    if(legs % chicken == 0 && legs % duck == 0){
		        System.out.println("ANY");
		    }else if(legs % chicken == 0 && legs % duck != 0){
		        System.out.println("CHICKEN");
		    }else if(legs % chicken != 0 && legs % duck == 0){
		        System.out.println("DUCK");
		    }else{
		        System.out.println("NONE");
		    }
		}
	}
}
