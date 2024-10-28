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
            int r = sc.nextInt();

            int count = 0;

            int arr[] = new int[n];
            for (int j = 0; j < n; j++)
            {
                arr[j] = sc.nextInt();
            }

            for (int k = 0; k < n; k++)
            {
                if ((arr[k] + r) % 7 == 0)
                {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
