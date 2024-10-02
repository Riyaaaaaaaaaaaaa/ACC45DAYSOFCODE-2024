import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		while(T-- > 0)
		{
		    int Xa = sc.nextInt();
		    int Xb = sc.nextInt();
		    int Xc = sc.nextInt();
		    
		    if((Xa > 50) || (Xb > 50) || (Xc > 50))
		    {
		        if((Xa > Xb) && (Xa > Xc))
		        {
		            System.out.println("A");
		        }
		        if((Xb > Xa) && (Xb > Xc))
		        {
		            System.out.println("B");
		        }
		        if((Xc > Xa) && (Xc > Xb))
		        {
		            System.out.println("C");
		        }
		    }
		    else
		    {
		        System.out.println("NOTA");
		    }
		}
  }
}
