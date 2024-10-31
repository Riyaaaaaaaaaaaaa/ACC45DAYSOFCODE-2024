import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        for (int i = 0; i < t; i++) {
            int x = read.nextInt();
            int y = read.nextInt();
            if ((x + y + 1) < 2) {
                System.out.println("Alice");
            }
            else {
                if ((((x + y + 1) % 4) == 1) || (((x + y + 1) % 4) == 2)) {
                    System.out.println("Alice");
                }
                else {
                    System.out.println("Bob");
                }
            }
        }
    }
}
