import java.util.*;
class CharOccurrence
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = sc.next();
        System.out.print("Enter character : ");
        char ch = sc.next().charAt(0);
        int len = str.length();
        int pos = -1;
        int[] x = new int[10];
        for(int i=0;  i<len; i++)
        {
            if(str.charAt(i) == ch)
            {
                pos++;
                x[pos] = i;
            }
        }
        if(pos == -1)
        {
            System.out.println(ch +" is not present in " + str);
        }
        else
        {
            System.out.print(ch + " is present in " + str + " at position ");
            for(int i=0; i<=pos; i++)
            {
                System.out.print(x[i] + " ");
            }
        }
    }
}