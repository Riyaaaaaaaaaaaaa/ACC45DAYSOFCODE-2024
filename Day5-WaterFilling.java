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
		    int B1 = sc.nextInt();
		    int B2 = sc.nextInt();
		    int B3 = sc.nextInt();
		    
		    if((B1 == 0 && B2 == 0 && B3 == 0) || (B1 == 0 && B2 == 0) || (B2 == 0 && B3 == 0) || (B1 == 0 && B3 == 0))
		    {
		        System.out.println("Water filling time");
		    }
		    else
		    {
		        System.out.println("not now");
		    }
		}

	}
}
