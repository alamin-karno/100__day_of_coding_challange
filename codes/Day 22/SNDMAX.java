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
		int textCase, x,y,z;
		
		Scanner sc = new Scanner(System.in);
		
		textCase = sc.nextInt();
		
		while(textCase >0){
		    x = sc.nextInt();
		    
		    y = sc.nextInt();
		    
		    z = sc.nextInt();
		    
		    if(x >= y && x <= z || x <= y && x >= z){
		        System.out.println(x);
		    }
		    else if(y >= x && y <= z || y <= x && y >= z){
		        System.out.println(y);
		    }
		    else if(z >= x && z <= y || z <= x && z >= y){
		        System.out.println(z);
		    }
		    
		    textCase --;
		}
	}
}
