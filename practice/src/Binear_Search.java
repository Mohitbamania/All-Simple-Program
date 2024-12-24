import java.util.Scanner;
public class Binear_Search {

    public static int binear(int arr [], int n, int num){
        int mid;
        int lb = 0;
        int ub = n-1;

        while(lb<=ub){
            mid = (lb + ub) / 2;

            if(arr[mid] == num){
                return mid;
            }
            else if(arr[mid]>num){
                ub = mid - 1;
            }
            else{
                lb = mid + 1;
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

        int result = binear(arr,n,num);

        if(result != -1){
            System.out.print("Your element is presented at the index:" + result);
        }
        else{
            System.out.print("Yor element is not presented in the array");
        }
    }
}
