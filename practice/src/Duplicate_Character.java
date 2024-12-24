import java.util.Scanner;
public class Duplicate_Character {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string:");
        String str = sc.nextLine();

        char arr [] = str.toCharArray();

        char temp;

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(new String(arr));

        int k=0;

        for(int l=0; l<arr.length-1; l++){
            if(arr[l]!=arr[l+1]){
                arr[k] = arr[l];
                k++;
            }
        }
        arr[k] = arr[arr.length-1];
        k++;

        for(int m=0; m<k; m++){
            System.out.print(arr[m]);
        }
    }
}