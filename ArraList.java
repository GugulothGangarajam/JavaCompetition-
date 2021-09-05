/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{   
	   // Scanner sc=new Scanner(System.in);
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    String s=br.readLine();
	    int n=Integer.parseInt(s);
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
		    al.add(i);
		}
		Iterator itr=al.iterator();
		while(itr.hasNext()){
		    System.out.println(itr.next());
		}
	}
}
