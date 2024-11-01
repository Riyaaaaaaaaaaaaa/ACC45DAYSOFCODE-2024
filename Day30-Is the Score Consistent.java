import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n--> 0) {
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            int d = s.nextInt();
            if (a > c || b > d)
                System.out.println("impossible");
            else
                System.out.println("possible");
        }

    }
}
