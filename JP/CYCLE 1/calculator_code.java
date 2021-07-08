import java.util.Scanner;
class calculator{
    public static void main(String[] args){
        char operator;
        int a , b , ans;
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose operator : ");
        operator = sc.next().charAt(0);
        System.out.print("a = ");
        a = sc.nextInt();
        System.out.print("b = ");
        b = sc.nextInt();
        switch(operator){
            case '+' : 
            ans = a + b;
            System.out.println(a + " + " + b + " = "+ans);
            break;
            case '-' : 
            ans = a - b;
            System.out.println(a + " - " + b + " = "+ans);
            break; 
            case '*' : 
            ans = a * b;
            System.out.println(a + " * " + b + " = "+ans);
            break;
            case '/' : 
            ans = a / b;
            System.out.println(a + " / " + b + " = "+ans);
            break;
        }
        sc.close();
    }
}

