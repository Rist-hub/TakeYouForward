
import java.util.Scanner;

public class NumberPattern6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int var=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<i+1; j++){
                System.out.print(var);
                var++;
            }
            System.out.println();
        }
    }
}