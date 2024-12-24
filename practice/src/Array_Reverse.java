import java.util.Scanner;
public class Array_Reverse {

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

        int lb = 0;
        int ub = n-1;
        while(lb<=ub){
            int temp = arr[lb];
            arr[lb] = arr[ub];
            arr[ub] = temp;

            lb++;
            ub--;
        }

        System.out.println("Your reversed array is:");
        for(int k=0; k<n; k++){
            System.out.println(arr[k]);
        }
    }
}
