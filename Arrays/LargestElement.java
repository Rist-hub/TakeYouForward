public class LargestElement{
    public static int largest(int[] arr){
        int large = 0;
        for(int i=0; i<arr.length; i++){
            if(large<arr[i]){
                large = arr[i];
            }
        }
        return large;
    }

    public static void main(String[] args){
        int[] arr = {3,9,2,1,4,6,8,7};
        int l = largest(arr);
        System.out.println(l);
    }
}