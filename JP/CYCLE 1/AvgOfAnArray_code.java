import java.util.Scanner;
class AvgOfAnArray{
    public static void main(String[] args) {
        int n , sum = 0 , avg;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < A.length; i++){
            A[i] = sc.nextInt();
        }
        for(int i = 0; i < A.length; i++){
            sum = sum + A[i];
        }
        avg = sum / A.length;
        System.out.println("Avg = "+avg);
    }

}