
import java.util.Scanner;

public class LetterPattern2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for(int j=0; j<n; j++){
            String s = "";
            for(int i=65; i<65+n-j; i++){
                char value = (char)i;
                s = s + value;
            }
            System.out.println(s);
        }
    }
}