import java.util.*;
class VowelOrConsonant
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Charachter : ");
        char ch = sc.next().charAt(0);
        if((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u'))
        {
            System.out.println(ch + " is VOWEL");
        }
        else if((ch == 'A') || (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U'))
        {
            System.out.println(ch + " is VOWEL");
        }
        else
        {
            System.out.println(ch + " is CONSONANT");
        }
    }
}