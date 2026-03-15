
import java.util.Scanner;

public class LetterPattern5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        String s = "";
        for(int i=65+n-1; i>=65; i--){
            char value = (char)i;
            s = value + s;
            System.out.println(s);
        }
        
    }
}