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
		int testCase, rtpCourses, auditCourses, non_rtpCourses;
		
		Scanner sc = new Scanner(System.in);
		
		testCase = sc.nextInt();
		
		while(testCase -- > 0){
		    rtpCourses = sc.nextInt();
		    
		    auditCourses = sc.nextInt();
		    
		    non_rtpCourses = sc.nextInt();
		    
		    
		    System.out.println((rtpCourses*4) + (auditCourses * 2) + (non_rtpCourses * 0));
		}
	}
}
