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
		int testCase, level, minutes, breakTime;
		
		Scanner sc = new Scanner(System.in);
		
		testCase = sc.nextInt();
		
		while(testCase > 0){
		    
		    level = sc.nextInt();
		    
		    minutes = sc.nextInt();
		    
		    breakTime = sc.nextInt();
		    
		    int result = 0;
		    
		    for(int i= 1; i <= level; i++){
		        result += minutes;
		        
		        if(i % 3 == 0 && i != level){
		            result += breakTime;
		        }
		    }
		    
		    System.out.println(result);
		    
		    testCase --;
		}
	}
}
