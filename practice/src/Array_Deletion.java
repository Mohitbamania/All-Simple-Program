import java.util.Scanner;
public class Array_Deletion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr [] = new int[20];

        System.out.print("Enter How many elements do you want to enter:");
        int n = sc.nextInt();

        System.out.println("Enter the array elements");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Your array elements are:");
        for(int j=0; j<n; j++) {
            System.out.println(arr[j]);
        }

        System.out.print("Enter the index at which do you want to delete the elements:");
        int index = sc.nextInt();

        for(int k=index-1; k<n; k++){
            arr[k] = arr[k+1];
        }

        n--;

        System.out.println("The upgraded array is:");
        for(int l=0; l<n; l++){
            System.out.println(arr[l]);
        }
    }
}
