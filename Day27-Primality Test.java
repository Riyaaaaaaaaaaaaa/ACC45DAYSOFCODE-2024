import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        int t, n;
        Scanner s = new Scanner(System.in);
        t = s.nextInt();
        for (int i = 0; i < t; i++) {
            int count = 0;
            n = s.nextInt();

            for (int j = 1; j <= n; j++) {
                if (n % j == 0) {
                    count++;
                }

            }

            if (count == 2) {
                System.out.println("yes");
            }
            else
                System.out.println("no");

        }

    }
}
