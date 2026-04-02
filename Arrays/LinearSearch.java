public class LinearSearch{
    public static int search(int[] arr, int nums){
        int index = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==nums){
                index = i;
            }
        }
    return index;
    }

    public static void main(String[] args){
        int[] arr = {3,6,1,2,8,0,34,6,89};
        int nums = 1;
        System.out.println(search(arr, nums));
    }
}