import java.util.Scanner;
public class Consonant_Vowels {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string:");
        String str = sc.nextLine();
        str = str.toUpperCase();

        int vowels = 0;
        int consonents = 0;

        for(int i=0; i<str.length(); i++){
            char match = str.charAt(i);

            if(match == 'A' || match == 'E' || match == 'I' || match == 'O' || match == 'U'){
                vowels++;
            }
            else{
                consonents++;
            }
        }
        System.out.println("The numbers of vowels in the string are:" + vowels);
        System.out.println("The numbers of consonents in the string are:" + consonents);
    }
}
