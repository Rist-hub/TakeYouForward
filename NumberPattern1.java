
import java.util.Scanner;

public class NumberPattern1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        String num = "";
        for(int i=1; i<=n; i++){
            num=num+i;
            System.out.println(num);
        }
    }
}