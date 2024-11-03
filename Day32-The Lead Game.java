import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p1, p2, lead = 0, win = 0, diff, sum1 = 0, sum2 = 0;
        while (n--> 0) {
            p1 = sc.nextInt();
            p2 = sc.nextInt();
            sum1 += p1;
            sum2 += p2;
            if (sum1 > sum2) {
                diff = sum1 - sum2;
                if (diff > lead) {
                    lead = diff;
                    win = 1;
                }

            }
            else {
                diff = sum2 - sum1;
                if (diff > lead) {
                    lead = diff;
                    win = 2;
                }
            }
        }
        System.out.println(win + " " + lead);
    }
}
