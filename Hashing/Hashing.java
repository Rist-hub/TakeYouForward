
import java.util.Scanner;

public class Hashing{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int hashSize = sc.nextInt();
        System.out.print("Enter value to find frequency: ");
        int valueFromQuery = sc.nextInt();
        int[] arr = {3, 4, 7, 1, 11, 15, 24, 9, 3, 11, 7, 9, 1, 9};
        int[] hashArr = new int[hashSize];
        for(int i = 0; i<arr.length; i++){
            hashArr[arr[i]] +=1;
        }

        System.out.print(hashArr[valueFromQuery]);
    }
}