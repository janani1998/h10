/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String a[]=s.split(" ");
		int l=a.length;
		for(int i=0;i<l;i++){
			a[i]=(a[i].substring(0,1).toUpperCase()+a[i].substring(1));
			
		System.out.print(a[i]+" ");
		}
	}
}
