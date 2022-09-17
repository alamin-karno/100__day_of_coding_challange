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
		
		
		try
{
  int numberOfSoldiers;
		int numberOfWeapons[] = new int[100];
		
		Scanner sc = new Scanner(System.in);
		
		numberOfSoldiers = sc.nextInt();
		
	 //System.out.println(numberOfSoldiers);
		
		for(int i =0 ; i< numberOfSoldiers; i++){
		    numberOfWeapons[i] = sc.nextInt();
		}
		
		int lucky = 0, unlucky = 0;
		
		for(int j=0; j < numberOfSoldiers; j++){
		    
		    if(numberOfWeapons[j] % 2 == 0){
		        lucky++;
		    }else{
		        unlucky++;
		    }
		   
		}
		
		if(lucky > unlucky){
		    System.out.println("READY FOR BATTLE");
		}else{
		    System.out.println("NOT READY");
		}
}
catch(Exception t){
System.out.println("Error: "+t); 
}
		
		
	}
}
