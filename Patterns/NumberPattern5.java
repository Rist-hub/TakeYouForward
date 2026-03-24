
import java.util.Scanner;

public class NumberPattern5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        String left="", right = "";
        for(int i=1; i<=n; i++){
            left =left+ i;
            System.out.print(left);
            for(int j=(n-i)*2; j>0; j--){
                System.out.print(" ");
            }
            right =i + right;
            System.out.print(right);
            System.out.println();
        }
    }
}