import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t--> 0)
        {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int p = sc.nextInt();

            int total_marks = (x * 3) - (n - x);

            if (p <= total_marks)
            {
                System.out.println("PASS");
            }
            else
            {
                System.out.println("FAIL");
            }
        }
        sc.close();
    }
}
