import java.util.Scanner;

/*

*****
*   *
*   *
*   *
*****

*/

public class AstrikPattern10{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.print("*");
        }
        System.out.println();
        for(int row=0; row<n-2; row++){
            System.out.print("*");
            for(int i=0; i<n-2; i++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for(int i=0; i<n; i++){
            System.out.print("*");
        }
    }
}