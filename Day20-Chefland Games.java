import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t, r1, r2, r3, r4;
        t = sc.nextInt();
        while (t-- > 0)
        {
            r1 = sc.nextInt();
            r2 = sc.nextInt();
            r3 = sc.nextInt();
            r4 = sc.nextInt();
            
            if (r1 == 0 && r2 == 0 && r3 == 0 && r4 == 0)
                System.out.println("IN");
            else if (r1 == 1 || r2 == 1 || r3 == 1 || r4 == 1)
                System.out.println("OUT");

        }

    }
}
