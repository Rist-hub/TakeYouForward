
import java.util.Scanner;

public class AstrikPattern1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        String astrik = "";
        for(int i=1; i<=n; i++){
            astrik=astrik+"*";
        }
        for(int i=1; i<=n; i++){
            System.out.println(astrik);
        }
    }
}