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
		int positiveInt;
		
		Scanner sc = new Scanner(System.in);
		
		positiveInt = sc.nextInt();
		
		if(positiveInt < 2){
		    System.out.println(0);
		}
		else{
		    int count = 0;
		    for(int i = 0;i< positiveInt; i++){
		        for(int j =0; j< positiveInt; j++){
		            if(i+j == positiveInt){
		                count++;
		            }
		        }
		    }
		    
		    System.out.println(count);
		}
	}
}
