
import java.util.Scanner;

public class NumberPattern3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        double zeroes = Math.pow(10, n);
        double addition = zeroes;
        for(int i=2; i<=n; i++){
            zeroes = zeroes/10;
            addition = addition+(zeroes*i);
        }
        for(int j=1; j<=n; j++){
            addition=addition/10;
            System.out.println((int)addition);
        }
    }
}