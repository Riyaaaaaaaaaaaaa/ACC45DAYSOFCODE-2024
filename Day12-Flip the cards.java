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
            
            int face_down = n - x;
            
            if(x >= face_down)
            {
                System.out.println(face_down);
            }
            else
            {
                System.out.println(x);
            }
        }
	}
}
