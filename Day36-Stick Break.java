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
        while (T--> 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            if (n % k == 0) {
                System.out.println(0);
            }
            else {
                System.out.println(1);
            }
        }
    }
}
