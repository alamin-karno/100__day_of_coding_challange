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
		int testCase, disposableMask, clothMask ;
		
		Scanner sc = new Scanner(System.in);
		
		testCase = sc.nextInt();
		
		while(testCase-- > 0){
		    disposableMask = sc.nextInt();
		    
		    clothMask = sc.nextInt();
		    
		    if((disposableMask*100) < (clothMask*10)){
		        System.out.println("Disposable");
		    }else if((disposableMask*100) >= (clothMask*10)){
		        System.out.println("Cloth");
		    }
		}
	}
}
