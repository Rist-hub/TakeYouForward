
import java.util.Scanner;

public class LetterPattern4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        String s = "";
        String reverse = "";
        for(int j=0; j<n; j++){
            s = "";
            reverse = "";

            for(int i=n-1; i>j; i--){
                System.out.print(" ");
            }
            for(int i=65; i<=65+j; i++){
                char value = (char)i;
                s = s + value;               

            }
            for(int r=s.length()-2;r>=0;r--){
                reverse = reverse + s.charAt(r);

            }
            System.out.print(s+reverse);
            System.out.println();
        }
        
    }
}