import java.util.*;
class BubbleSort
{
    static void Sorting(int a[], int n)
    {
        int x;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                if(a[j] > a[j+1])
                {
                    x = a[j+1];
                    a[j+1] = a[j];
                    a[j] = x;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = s.nextInt();
        System.out.print("Enter elements into array : ");
        int[] a = new int[n];
        for(int i=0; i<n; i++)
        {
            a[i] = s.nextInt();
        }
        Sorting(a, n);
        System.out.print("Array after sorting : ");
        for(int i=0; i<n; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
