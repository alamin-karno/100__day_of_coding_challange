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
		int testCase, doubleRoom, thripleRoom;
		
		Scanner sc = new Scanner(System.in);
		
		testCase = sc.nextInt();
		
		while(testCase > 0){
		    doubleRoom = sc.nextInt();
		    thripleRoom = sc.nextInt();
		    
		    
		    if((doubleRoom*3) <= (thripleRoom * 2)){
		        System.out.println(doubleRoom*3);
		    }
		    else{
		        System.out.println(thripleRoom*2);
		    }
		    
		    testCase --;
		}
	}
}
