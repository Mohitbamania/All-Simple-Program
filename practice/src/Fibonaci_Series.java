import java.util.Scanner;
public class Fibonaci_Series {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number upto which you want to find fibonaci series:");
        int num = sc.nextInt();

        int a = 1;
        int b = 1;

        System.out.print(a + "," + b + ",");

        for(int i=0; i<num; i++){
            int c = a + b;
            a = b;
            b = c;

            System.out.print(c + ",");
        }
    }
}
