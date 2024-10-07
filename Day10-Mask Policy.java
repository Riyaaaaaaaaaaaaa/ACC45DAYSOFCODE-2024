import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0)
		{
		    int n = sc.nextInt();                 //total person
		    int a = sc.nextInt();                 //infected person
		    
		    int uninfected = n - a;               //uninfected person
		    
		    if(uninfected >= a)
		    {
		        System.out.println(a);
		    }
		    else
		    {
		        System.out.println(uninfected);
		    }
		}
		
        sc.close();
	}
}
