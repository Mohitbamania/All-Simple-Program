import java.util.Scanner;
public class String_Reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string:");
        String str = sc.nextLine();

        for(int i=str.length()-1; i>=0; i--){
            System.out.println(str.charAt(i));
        }
    }
}