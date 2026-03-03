
import java.util.Scanner;

public class NumberPattern2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        String ones = "";
        int intOne=0;
        for(int i=1; i<=n; i++){
            ones=ones+1;
            intOne = Integer.parseInt(ones);
            intOne=intOne*i;
            System.out.println(intOne);
        }
    }
}