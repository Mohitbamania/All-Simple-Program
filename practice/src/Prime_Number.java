import java.util.Scanner;
public class Prime_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to check:");
        int num = sc.nextInt();

        int temp = 0;

        for(int i=2; i<num; i++){
            if(num % i == 0){
                temp = temp + 1;
            }

        }
        if(temp>0){
            System.out.println(num + " is not prime number");
        }
        else{
            System.out.println(num + " is prime number");
        }
    }
}
