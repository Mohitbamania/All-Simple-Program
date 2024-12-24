import java.util.Scanner;
public class Max_Min {

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

        int max = arr[0];
        int min = arr[0];

        for(int k=1; k<n; k++){
            if(arr[k]>max){
                max = arr[k];
            }
            else if(arr[k]<min){
                min = arr[k];
            }
        }

        System.out.println("The maximum of array element is:" +max);
        System.out.print("The minimum of array element is:" +min);
    }
}
