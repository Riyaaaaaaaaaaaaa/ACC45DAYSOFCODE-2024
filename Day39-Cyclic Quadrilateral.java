import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();
        while (T--> 0) {
            // Read the numbers a and b.
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            if (a + c == 180 && b + d == 180)
                System.out.println("YES");
            else
                System.out.println("NO");

        }

    }
}
