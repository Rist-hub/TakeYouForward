public class LeftRotateByOne{
    public static int[] rotate(int[] arr){
        int temp = arr[0];
        for(int i=1; i<arr.length; i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1] = temp;

        return arr;
    }

    public static void main(String[] args){
        int[] arr = {3,4,5,8,1,9};
        int[] newArr = rotate(arr);
        for(int in : newArr){
            System.out.print(in+", ");
        }
    }
    
}