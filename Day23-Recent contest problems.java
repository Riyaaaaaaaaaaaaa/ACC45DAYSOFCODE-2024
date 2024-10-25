import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T--> 0) {
            int N = sc.nextInt();
            String a[] = new String[N];
            for (int i = 0; i < N; i++)
            {
                a[i] = sc.next();
            }
            int st = 0;
            int lt = 0;
            for (int i = 0; i < N; i++)
            {
                if (a[i].equals("START38"))
                {
                    st++;
                }
                else if (a[i].equals("LTIME108"))
                {
                    lt++;
                }
            }
            System.out.println(st + " " + lt);

        }

    }
}
