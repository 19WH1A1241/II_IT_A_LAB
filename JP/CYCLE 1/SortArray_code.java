import java.util.*;
class SortArray
{
    static void Sort(int a[], int n)
    {
        int temp;
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
        System.out.print("Size of array : ");
        int n = sc.nextInt();
        System.out.print("Elements : ");
        int[] A = new int[n];
        for(int i=0; i<n; i++)
        {
            A[i] = sc.nextInt();
        }
        Sort(A, n);
        System.out.print("Array after sorting : ");
        for(int i=0; i<n; i++)
        {
            System.out.print(A[i] + " ");
        }
    }
}