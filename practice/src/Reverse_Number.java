import java.util.Scanner;
public class Reverse_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number:");
        int num = sc.nextInt();

        int r;

        while(num>0){
            r = num % 10;
            num = num / 10;
            System.out.println(r);
        }
    }
}
