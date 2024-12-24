import java.util.Scanner;
public class Integer_To_Strig {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 6 digit number:");
        int num = sc.nextInt();


        String str = String.valueOf(num);

        if(str.length() == 6){
            for(int i=0; i<str.length(); i++){
                System.out.print(str.charAt(i) + "   ");
            }
        }
        else{
            System.out.println("Enter valid 6 digit number");
        }
    }
}
