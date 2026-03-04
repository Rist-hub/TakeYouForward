
import java.util.Scanner;

public class AstrikPattern3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for(int i=0; i<=n-1; i++){
            for(int j=n; j>=i+1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}