import java.util.Scanner;
public class Array_Insertion {
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

        System.out.print("Enter the index at which do you want to enter the elements:");
        int index = sc.nextInt();

        System.out.print("Enter the number that you want to enter:");
        int num = sc.nextInt();

        for(int k=n-1; k>=index-1; k--){
            arr[k+1] = arr[k];
        }
        arr[index-1] = num;
        n++;

        System.out.println("The upgraded array is:");
        for(int l=0; l<n; l++){
            System.out.println(arr[l]);
        }








    }
}
