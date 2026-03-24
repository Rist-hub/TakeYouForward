
import java.util.Scanner;

public class LetterPattern1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        String s = "";
        for(int i=65; i<65+n; i++){
            char value = (char)i;
            s = s + value;
            System.out.println(s);
        }
        
    }
}