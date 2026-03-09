
import java.util.Scanner;

public class NumberPattern4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        String binary = "";
        for(int i=1; i<=n; i++){
            if(i%2==0){
                binary = 0 + binary;
            }else{
                binary = 1 + binary;
            }
            System.out.println(binary);
        }
    }
}