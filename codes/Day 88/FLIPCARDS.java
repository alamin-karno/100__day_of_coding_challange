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
		int testCase, totalCards, faceUpCards;
		
		Scanner sc = new Scanner(System.in);
		
		testCase = sc.nextInt();
		
		while(testCase -- > 0){
		    totalCards = sc.nextInt();
		    
		    faceUpCards = sc.nextInt();
		    
		    if(faceUpCards == totalCards){
		        System.out.println(0);
		    }
		    else if(faceUpCards == 0){
		        System.out.println(0);
		    }
		    else if(faceUpCards <= (totalCards - faceUpCards)){
		        System.out.println(faceUpCards);
		    }
		    else if(faceUpCards > (totalCards - faceUpCards)){
		        System.out.println(totalCards - faceUpCards);
		    }
		    
		}
	}
}
