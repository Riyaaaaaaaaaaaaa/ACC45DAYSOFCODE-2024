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
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    
		    int score_A_first = (500 - (X*2)) + (1000 - ((X+Y)*4));
		   
		    int score_B_first = (1000 - (Y*4)) + (500 - ((X+Y)*2));
		    
		    if(score_A_first >= score_B_first)
		    {
		        System.out.println(score_A_first);
		    }
		    else
		    {
		        System.out.println(score_B_first);
		    }
		}
    }
}
