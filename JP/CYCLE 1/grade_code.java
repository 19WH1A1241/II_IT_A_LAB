import java.util.Scanner;
public class grade
{
	public static void main(String[] args) {
		int marks[] = new int[6];
		//Scanner sc = new Scanner(System.in);
		float total = 0 , avg;
        int i;
        Scanner sc = new Scanner(System.in);
        //System.out.print("Subject "+(i + 1)+" : ");
        for(i = 0; i < 6; i++){
            System.out.print("Subject "+(i + 1)+" : ");
            marks[i] = sc.nextInt();
        }
        for(i = 0; i < 6; i++){
            total += marks[i];
        }
        sc.close();
        avg = total / 6;
        System.out.print("Grade : ");
        if(avg>=80)
        {
            System.out.print("A");
        }
        else if(avg>=60 && avg<80)
        {
           System.out.print("B");
        } 
        else if(avg>=40 && avg<60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
	}
}