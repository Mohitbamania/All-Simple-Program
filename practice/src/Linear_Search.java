import java.util.Scanner;
public class Linear_Search {

    public static int linear(int arr [], int n, int num){
        for(int i=0; i<n; i++){
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }

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

        System.out.print("Enter the number that you want to find:");
        int num = sc.nextInt();

        int result = linear(arr,n,num);

        if(result != -1){
            System.out.print("Your element is presented at the index:" + result);
        }
        else{
            System.out.print("Yor element is not presented in the array");
        }
    }
}
