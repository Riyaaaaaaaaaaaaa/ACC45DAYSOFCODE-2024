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

        while (t-- > 0)
        {
            int h = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (h < y) {
                System.out.println("1");
                return;
            }
            int spl = h - y;
            int count = spl / x;
            if (spl - count * x == 0) {
                count = count;
            }
            else {
                count++;
            }
            int numAttacks = count + 1;
            System.out.println(numAttacks);
        }
    }
}
