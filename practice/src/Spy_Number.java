import java.util.Scanner;
public class Spy_Number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();

        int temp = num;
        int r;
        int sum = 0;
        int product = 1;

        while(num>0){
            r = num % 10;
            num = num / 10;
            sum = sum + r;
            product = product * r;
        }

        if(sum==product){
            System.out.println("Given number is spy");
        }
        else{
            System.out.println("Given number is not spy");
        }
    }
}
