
import java.util.Scanner;

public class AstrikPattern8{
    public static void main(String[] args){
        /*

        **********
        ****  ****
        ***    ***
        **      **
        *        *
        *        *
        **      **
        ***    ***
        ****  ****
        **********

        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        String astrik = "";
        for(int row=0; row<n; row++){
            for(int i=n-row; i>0; i--){
                System.out.print("*");
            }
            for(int i=0; i<2*row; i++){
                System.out.print(" ");
            }
            for(int i=n-row; i>0; i--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int row=0; row<n; row++){
            for(int i=0; i<row+1; i++){
                System.out.print("*");
            }
            for(int i=2*(n-row)-2; i>0; i--){
                System.out.print(" ");
            }
            for(int i=0; i<row+1; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}