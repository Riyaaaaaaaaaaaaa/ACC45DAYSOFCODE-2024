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
            int n = sc.nextInt();
            int[] myArr = new int[n];
            
            int sum = 0;
            int odd = 0;
            for (int i = 0; i < n; i++) 
            {
                myArr[i] = sc.nextInt();
                sum += myArr[i];
                if (myArr[i] % 2 != 0) 
                    odd++;
            }
            if (odd == 0)
                System.out.println("NO");
            else if (sum % 2 == 0 && odd % 2 == 0) 
                System.out.println("YES");
            else 
                System.out.println("NO");
        }
        sc.close();
    }
}
