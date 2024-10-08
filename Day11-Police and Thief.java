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
            int x = sc.nextInt();
            int y = sc.nextInt();
            int count = 0;

            if (x > y)
            {
                while (x > y) 
                {
                    x -= 2;
                    y -= 1;
                    count++;
                }
            }
            else
            {
                while (x < y) 
                {
                    x += 2;
                    y += 1;
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
