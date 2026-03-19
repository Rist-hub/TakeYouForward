
import java.util.Scanner;

public class NumberPattern7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int store=0;
        for(int row=0; row<n; row++){
            store = n;
            for(int i=0; i<n; i++){
                if(row==0){
                    System.out.print(store);
                }else if(row<=i){
                    System.out.print(store-1);
                }else{
                    countDown(store, row);
                }
            }
            System.out.println();
        }
        
    }

    public static void countDown(int n, int m){
        for(int i=n; i>=n-m; i--){
            System.out.print(i);
        }
    }
}