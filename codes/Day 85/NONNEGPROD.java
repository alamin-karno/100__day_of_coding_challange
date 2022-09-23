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
		int testCase, length;
		
		
		Scanner sc = new Scanner(System.in);
		
		testCase = sc.nextInt();
		
		while(testCase -- > 0){
		    
		    length = sc.nextInt();
		    
		    int[] array = new int[length];
		    
		    boolean isZero = false;
		    boolean isAllPositive = false;
		    
		    int count = 0;
		    
		    for(int i = 0; i < length; i++){
		      
		      array[i] = sc.nextInt();
		      
		      if(array[i] == 0){
		          isZero = true;
		      }
		      else if(array[i] < 0){
		          isAllPositive = false;
		          count++;
		      }
		     
		    }
		    
		    if(isZero || isAllPositive){
		       System.out.println(0); 
		    }
		    else if(count % 2 == 0){
		        System.out.println(0); 
		    }
		    else{
		        System.out.println(1); 
		    }
		    
		    
		    
		}
		
		
	}
}
