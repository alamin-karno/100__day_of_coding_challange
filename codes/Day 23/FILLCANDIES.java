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
		int testCase, candy, pocket, hold;
		
		Scanner sc = new Scanner(System.in);
		
		testCase = sc.nextInt();
		
		while(testCase > 0){
		    candy = sc.nextInt();
		    
		    pocket = sc.nextInt();
		    
		    hold = sc.nextInt();
		    
		    int oneBeg = pocket * hold ;
		    
		    if(candy <= oneBeg){
		        System.out.println(1);
		    }
		    else{
		        if(candy % oneBeg == 0){
		            System.out.println(candy/oneBeg);
		        }
		        else{
		            System.out.println((candy / oneBeg) + 1);
		        }
		    }
		    
		    testCase --;
		}
	}
}
