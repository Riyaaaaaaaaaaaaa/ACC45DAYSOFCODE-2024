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
        while (t--> 0)
        {
            int a = s.nextInt();
            int b = s.nextInt();
            int c = 21 - (a + b);
            if (c <= 10)
                System.out.println(c);
            else
                System.out.println(-1);
        }
    }
}
