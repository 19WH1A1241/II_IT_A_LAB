import java.util.*;
class VowelConsonantCount
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("String : ");
        String str = sc.next();
        int vcount = 0, ccount = 0;
        int n = str.length();
        for(int i=0; i<n; i++)
        {
            char ch = str.charAt(i);
            if((ch == 'a') || (ch == 'e') || (ch == 'o') || (ch == 'i') || (ch == 'u'))
            {
                vcount++;
            }
            else if((ch == 'A') || (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U'))
            {
                vcount++;
            }
            else
            {
                ccount++;
            }
        }
        System.out.println("Vowel Count = " + vcount);
        System.out.println("Consonant Count = " + ccount);
    }
}