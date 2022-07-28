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
		
		int testCase, alice, bob, charlie;
		
		Scanner sc = new Scanner(System.in);
		
		testCase = sc.nextInt();
		
		while(testCase > 0){
		    alice = sc.nextInt();
		    bob = sc.nextInt();
		    charlie = sc.nextInt();
		    
		    if(alice >= bob && alice >= charlie){
		        System.out.println("Alice");
		    }
		    else if(bob >= alice && bob >= charlie ){
		        System.out.println("Bob");
		    }
		    else if(charlie >= alice && charlie >= bob){
		        System.out.println("Charlie");
		    }
		    
		    testCase --;
		}
		
	}
}
