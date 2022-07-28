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
		int testCase,totalLamp, redLamp , redPrice, bluePrice;
		
		Scanner sc = new Scanner(System.in);
		
		testCase = sc.nextInt();
		
		
		
		while(testCase > 0){
		    
		    int totalPrice = 0;
		    
		    totalLamp = sc.nextInt();
		    
		    redLamp = sc.nextInt();
		    
		    redPrice = sc.nextInt();
		    
		    bluePrice = sc.nextInt();
		    
		    if(redLamp > 0){
		        totalPrice = redLamp * redPrice;
		        
		        if(redPrice < bluePrice){
		            totalPrice = totalPrice + ((totalLamp- redLamp) * redPrice);
		        }
		        else{
		            totalPrice = totalPrice + ((totalLamp- redLamp) * bluePrice);
		        }
		    }
		    else{
		        if(redPrice < bluePrice){
		            totalPrice = totalPrice + ((totalLamp- redLamp) * redPrice);
		        }
		        else{
		            totalPrice = totalPrice + ((totalLamp- redLamp) * bluePrice);
		        }
		    }
		    
		    System.out.println(totalPrice);
		    
		    testCase --;
		}
	}
}
