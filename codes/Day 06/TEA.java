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
		int testCase, wantToDrink, jarCapacity, chargePerRefil;
		
		Scanner sc = new Scanner(System.in);
		
		testCase = sc.nextInt();
		
		while(testCase > 0){
		    
		    wantToDrink = sc.nextInt();
		    
		    jarCapacity = sc.nextInt();
		    
		    chargePerRefil = sc.nextInt();
		    
		    
		    if(wantToDrink < jarCapacity){
		        System.out.println(chargePerRefil);
		    }
		    else{
		        if(wantToDrink % jarCapacity == 0){
		            int refil = wantToDrink / jarCapacity;
		            
		            System.out.println(refil*chargePerRefil);
		        }else {
		            int needextrefil = wantToDrink / jarCapacity;
		            
		            System.out.println((needextrefil+1) * chargePerRefil);
		        }
		    }
		    
		    testCase--;
		    
		    
		}
	}
}
