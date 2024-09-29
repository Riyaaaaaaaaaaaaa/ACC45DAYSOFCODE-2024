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
            int dDSA = sc.nextInt();
            int dTOC = sc.nextInt();
            int dDM = sc.nextInt();
            int sDSA = sc.nextInt();
            int sTOC = sc.nextInt();
            int sDM = sc.nextInt();

            int Dragon_score = dDSA + dTOC + dDM;
            int Sloth_score = sDSA + sTOC + sDM;

            if (Dragon_score != Sloth_score)
            {
                if (Dragon_score > Sloth_score)
                {
                    System.out.println("Dragon");
                }
                else
                {
                    System.out.println("Sloth");
                }
            }
            else
            {
                if (dDSA != sDSA)
                {
                    if (dDSA > sDSA)
                    {
                        System.out.println("Dragon");
                    }
                    else
                    {
                        System.out.println("Sloth");
                    }
                }
                else
                {
                    if (dTOC != sTOC)
                    {
                        if (dTOC > sTOC)
                        {
                            System.out.println("Dragon");
                        }
                        else
                        {
                            System.out.println("Sloth");
                        }
                    }
                    else
                    {
                        System.out.println("Tie");
                    }
                }
            }
        }

    }
}
