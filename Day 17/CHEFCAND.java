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
		int testCase, children, candy;
		
		Scanner sc = new Scanner(System.in);
		
		testCase = sc.nextInt();
		
		while(testCase > 0 ){
		    children = sc.nextInt();
		    
		    candy = sc.nextInt();
		    
		    if(children <= candy){
		        System.out.println(0);
		    }else{
		        int candyNeed = children - candy;
		        
		        if(candyNeed % 4 == 0){
		            System.out.println(candyNeed/4);
		        }else{
		            System.out.println((candyNeed/4) + 1);
		        }
		    }
		    
		    testCase --;
		}
	}
}
