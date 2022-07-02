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
		int T,A,B;
		
		Scanner sc = new Scanner(System.in);
		
		T = sc.nextInt();
		
		while(T>0){
		    
		    A = sc.nextInt();
		    B = sc.nextInt();
		    
		    if(A == B){
		        System.out.println("ANY");
		    }
		    else if(A < B){
		        System.out.println("FIRST");
		    }
		    else if(A > B){
		        System.out.println("SECOND");
		    }
		    
		    T--;
		}
	}
}
