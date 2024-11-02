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
            int n = s.nextInt();
            System.out.println(fantasy(n));
        }
    }
    public static int fantasy(int n)
    {
        return (n * (n - 1));

    }
}
