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
		int testCase, initialVolume, finalVolume;
		
		Scanner sc = new Scanner(System.in);
		
		testCase = sc.nextInt();
		
		while(testCase > 0){
		    
		    initialVolume = sc.nextInt();
		    finalVolume = sc.nextInt();
		    
		    if(initialVolume > finalVolume){
		        System.out.println(initialVolume - finalVolume);
		    }
		    else{
		        System.out.println(finalVolume - initialVolume);
		    }
		    
		    testCase--;
		}
		
	}
}
