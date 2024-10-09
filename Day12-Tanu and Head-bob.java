import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String gestures = sc.next();
            
            boolean isIndian = false;
            boolean isNotIndian = false;
            
            for(int i = 0; i < n; i++)
            {
                char gesture = gestures.charAt(i);
                
                if(gesture == 'I')
                {
                    isIndian = true;
                    break;
                }
                
                if(gesture == 'Y')
                {
                    isNotIndian = true;
                }
            }
            
            if(isIndian)
            {
                System.out.println("INDIAN");
            }
            else if(isNotIndian)
            {
                System.out.println("NOT INDIAN");
            }
            else
            {
                System.out.println("NOT SURE");
            }
        }
    }
}
