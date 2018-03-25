/*package whatever //do not write package name here */

import java.util.*;

class Conscharacter {
	public static void main (String[] args) {
	    String temp="";
	    Boolean flag=false;
		Scanner in=new Scanner(System.in);
	    String input1=in.nextLine();
	    String input2=in.nextLine();
	    int len1=input1.length();
	    int len2=input2.length();
	    for(int index=0;index<len1;index++)
	    { for(int index2=index+2;index2<len1;index2++)
	        {
	        String sample=input2.replaceAll(input1.substring(index,index2),"");
	         if(!(sample.equals(input2)))
	         {
	             flag=true;
	             break;
	         }
	        }
	        if(flag==true)
	           break;
	    }
		if(flag==true)
		{
		    System.out.println("yes");
		}else
		{
		    System.out.println("No");
		}
	}
}
