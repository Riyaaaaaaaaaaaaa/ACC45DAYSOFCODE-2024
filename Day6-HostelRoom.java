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
		    int N = sc.nextInt();
		    int X = sc.nextInt();
		    
		    int[] arr = new int[N];
		    
		    int current_people = X;
		    int max_people = X;
		    
		    for(int i=0 ; i<N ; i++)
		    {
		        arr[i] = sc.nextInt();

                current_people += arr[i];

                if (current_people > max_people) 
                {
                    max_people = current_people;
                }
		    }
		    
		    System.out.println(max_people);
		}
	}
}
