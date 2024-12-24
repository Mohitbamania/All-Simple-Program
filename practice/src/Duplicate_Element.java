import java.util.Scanner;
public class Duplicate_Element {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {1,1,3,5,6,7,7,8,9};
        int j=0;

        for(int i=0; i<arr.length-1; i++){
            if(arr[i]!=arr[i+1]){
                arr[j] = arr[i];
                j++;
            }
        }
        arr[j] = arr[arr.length-1];
        j++;

        System.out.println("The updated array is:");
        for(int k=0; k<j; k++){
            System.out.println(arr[k]);
        }
    }
}
