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
		    int n = sc.nextInt(); //size_of_group
		    int x = sc.nextInt(); //cost_of_one_subscription
		    
		    int subscriptions = (n + 5) / 6;

        
            int totalCost = subscriptions * x;

        
            System.out.println( totalCost);
        }
    }
}
