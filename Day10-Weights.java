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
            int w = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            
            if((x == w) || (y == w) || (z == w) || (x + y == w) || (y + z == w) || (x + z == w) || (x + y + z == w))
            {
                System.out.println("Yes");
            }
            else
            {
                 System.out.println("No");
            }
        }
        sc.close();
	}
}
