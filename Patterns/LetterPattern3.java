
import java.util.Scanner;

public class LetterPattern3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for(int j=0; j<n; j++){
            String s = "";
            char value ='\0';
            for(int i=0; i<=j; i++){
                int letter = 65 + j;
                value = (char)letter;
                s = s + value;
            }
            System.out.println(s);
        }
    }
}