/*package whatever //do not write package name here */

import java.util.*;

class Strangecounter {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int input=in.nextInt();
		int value,temp;
		 value=temp=3;
	   for(int index=1;index<input;index++)
	   {
	       temp--;
	       if(temp==0)
	       {
	           temp=value=value*2;
	       }
	   }
		System.out.println(temp);
	    
	}
}
