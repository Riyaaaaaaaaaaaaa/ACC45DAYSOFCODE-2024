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

        while (T-- > 0)
        {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++)
            {
                arr[i] = sc.nextInt();
            }
            
            int maxElement = 0;
            for (int num: arr) 
            {
                if (num > maxElement) 
                {
                    maxElement = num; 
                }
            }
            
            int[] frequency = new int[maxElement + 1];
            for (int num: arr) 
            {
                frequency[num]++; 
            }

            int maxFrequency = 0;
            for (int freq: frequency) 
            {
                if (freq > maxFrequency) 
                {
                    maxFrequency = freq;
                }
            }

            int minOperations = N - maxFrequency;
            System.out.println(minOperations);
        }

        sc.close();
    }
}
