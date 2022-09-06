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
		int testCase, gym, personalTrainer, totalBudget;
		Scanner sc = new Scanner(System.in);
		
		testCase = sc.nextInt();
		
		while(testCase -- > 0){
		    gym = sc.nextInt();
		    personalTrainer = sc.nextInt();
		    
		    totalBudget = sc.nextInt();
		    
		    if((gym+personalTrainer) <= totalBudget){
		        System.out.println(2);
		    }
		    else if(gym <= totalBudget){
		        System.out.println(1);
		    }
		    else{
		        System.out.println(0);
		    }
		}
	}
}
