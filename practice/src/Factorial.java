import java.util.Scanner;
public class Factorial {

    public static int factorial(int a){
        if(a == 0){
            return 1;
        }
        else{
            return a * factorial(a-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number:");
        int a = sc.nextInt();

        int result = factorial(a);

        System.out.println("The factorial of your number is:" + result);
    }
}
