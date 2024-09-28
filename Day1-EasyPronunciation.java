import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- >0){
		    int N = sc.nextInt();
		    String S = sc.next();
		    System.out.println(isEasyToPronounce(S,N));
        }
        
        sc.close();
    }
    
    public static String isEasyToPronounce(String S,int N) {
        String vowels = "aeiou";
        int consonantStreak = 0;

        
        for (int i = 0; i < N; i++) {
            char ch = S.charAt(i);

            
            if (vowels.indexOf(ch) != -1) {
                consonantStreak = 0;  
            } else {
                consonantStreak++;  
            }

            if (consonantStreak >= 4) {
                return "NO";  
            }
        }

        return "YES";  
    }
}
		
