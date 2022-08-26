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
		int day1, day2, day3, day4;
		
		Scanner sc = new Scanner(System.in);
		
		day1 = sc.nextInt();
		day2 = sc.nextInt();
		day3 = sc.nextInt();
		day4 = sc.nextInt();
		
		int count = 0;
		
		if(day1 >= 10){
		    count ++;
		}
		if(day2 >= 10){
		    count ++;
		}
		if(day3 >= 10){
		    count ++;
		}
		if(day4 >= 10){
		    count ++;
		}
		
		System.out.println(count);
	}
}
