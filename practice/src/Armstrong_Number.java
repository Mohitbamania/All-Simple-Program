import java.util.Scanner;
public class Armstrong_Number {

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
            sum = sum + (r * r * r);
        }

        if(sum==temp){
            System.out.println("Given number is palindrom");
        }
        else{
            System.out.println("Given number is not paliondrom");
        }
    }
}
