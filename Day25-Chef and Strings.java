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
        while (t--> 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

            }
            long count = 0;
            for (int i = 0; i < n - 1; i++) {
                count += Math.abs(arr[i + 1] - arr[i]);
            }
            System.out.println(count - n + 1);
        }
    }
}
