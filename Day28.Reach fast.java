import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0)
        {
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            int d = Math.abs(a - b);
            if (d % c == 0)
            {
                System.out.println(d / c);
            }
            else if (d % c != 0)
            {
                System.out.println((d / c) + 1);
            }
        }

    }
}
