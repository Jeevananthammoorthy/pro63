/*package whatever //do not write package name here */

import java.util.*;

class square {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int index=0,count=0;
		  int[] array=new int[8];
		  for(index=0;index<8;index++)
		    array[index]=in.nextInt();
		   Arrays.sort(array);
		   for(index=0;index<4;index++)
		   {
		       if((2*array[index])==(array[index+4]))
		       {
		         count++;
		       }
		   }
		   System.out.println(count==4?"yes":"no");
	}
}
