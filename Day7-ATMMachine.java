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
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    
		    for(int i=0 ; i<n ; i++)
		    {
		        int a = sc.nextInt();
		        
		        if(a <= x)
		        {
		            System.out.print("1");
		            x = x - a;
		        }
		        else
		        {
		            System.out.print("0");
		        }
		    }
		    System.out.println(); 
		}
    }
}
