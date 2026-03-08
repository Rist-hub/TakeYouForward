
import java.util.Scanner;

public class AstrikPattern7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        String astrik = "";
        for(int i=1; i<=n; i++){
            astrik=astrik+"*";
            System.out.println(astrik);
        }
        for(int i=0; i<n; i++){
            for(int j=n-1; j>=i+1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}