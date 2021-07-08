import java.util.*;
class ReverseString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String s = sc.next();
        int n = s.length();
        String rev = "";
        for(int i=n-1; i>=0; i--)
        {
            rev += s.charAt(i);
        }
        System.out.println("Reverse of string : " + rev);
    }
}