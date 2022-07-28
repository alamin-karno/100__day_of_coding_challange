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
		int testCase, freeSpcae, _1GBFile, _2GBFile;
		
		Scanner sc = new Scanner(System.in);
		
		testCase = sc.nextInt();
		
		while(testCase > 0){
		    freeSpcae = sc.nextInt();
		    _1GBFile = sc.nextInt();
		    _2GBFile = sc.nextInt();
		    
		    if(freeSpcae >= (_1GBFile + _2GBFile * 2)){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		    
		    testCase--;
		}
	}
}
