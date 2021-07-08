import java.util.*;
class SortString
{
    static void Sort(char a[], int n)
    {
        char temp;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                if(a[j] > a[j+1])
                {
                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("String : ");
        String str = sc.next();
        int n = str.length();
        char[] A = new char[n];
        for(int i=0; i<n; i++)
        {
            A[i] = str.charAt(i);
        }
        Sort(A, n);
        System.out.print("Sorted string : ");
        for(int i=0; i<n; i++)
        {
            System.out.print(A[i]);
        }
    }
}