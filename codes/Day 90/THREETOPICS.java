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
		int a,b,c,x;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		x = sc.nextInt();
		
		if(a == x || b == x || c == x){
		    System.out.println("Yes");
		}else{
		    System.out.println("No");
		}
	}
}
