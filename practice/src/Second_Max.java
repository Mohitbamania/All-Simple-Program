import java.util.Scanner;
import java.util.Arrays;
public class Second_Max {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr [] = new int[20];

        System.out.print("Enter How many elements do you want to enter:");
        int n = sc.nextInt();

        System.out.println("Enter the array elements:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Your array elements are:");
        for(int j=0; j<n; j++) {
            System.out.println(arr[j]);
        }

        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;

        for(int k=0; k<n; k++){
            if(arr[k]>max){
                second_max = max;
                max = arr[k];
            }
            else if(arr[k]>second_max){
                second_max = arr[k];
            }
        }

        System.out.println("The second maximum value of array elemnt is:" + second_max);
    }
}
