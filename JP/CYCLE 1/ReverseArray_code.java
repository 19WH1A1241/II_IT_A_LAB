import java.util.Scanner;
class ReverseArray{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of array : ");
        n = sc.nextInt();
        int[] A = new int[n];
        System.out.print("Elements of array : ");
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        System.out.print("Reverse of array : ");
        for(int i = n - 1; i >= 0; --i){
            
            System.out.print(A[i]+" ");
        }
    }
}