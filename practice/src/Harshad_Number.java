import java.util.Scanner;
public class Harshad_Number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();

        int temp = num;
        int r;
        int sum = 0;

        while(num>0){
            r = num % 10;
            num = num / 10;
            sum = sum + r;
        }

        if(temp % sum == 0){
            System.out.println("The given number is harshar");
        }
        else{
            System.out.println("The given number is not harshar");
        }
    }
}
