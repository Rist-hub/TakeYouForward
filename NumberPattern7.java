
import java.util.Scanner;

public class NumberPattern7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int top =0, left=0, bottom=0, right=0;
        for(int i=0; i<=2*n-2; i++){
            for(int j=0; j<=2*n-2; j++){
                top = i;
                left = (2*n-2) - i;
                bottom = j;
                right = (2*n-2) - j;
                if(top<=left && top<=bottom && top<=right ){
                    System.out.print(n-top);
                }
                else if(left<=top && left<=bottom && left<=right){
                    System.out.print(n-left);
                }
                else if(bottom<=top && bottom<=left && bottom<=right){
                    System.out.print(n-bottom);
                }
                else if(right<=top && right<=left && right<=bottom){
                    System.out.print(n-right);
                }
            }
            System.out.println();
        }
        
    }

}