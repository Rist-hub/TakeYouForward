public class SecondLargestElement{
    public static int secondLargest(int[] arr){
        int largest = 0, secondLargest = 0;
        if(arr.length<2){
            return -1;
        }
        else{
            for(int i=0; i<arr.length; i++){
                if(largest<arr[i]){
                    largest = arr[i];
                }
                else if(secondLargest < arr[i]){
                    secondLargest = arr[i];
                }
            }
        }
        return secondLargest;
    }

    public static void main(String[] args){
        int[] arr = {3,9,2,1,4,6,8,7};
        int sl = secondLargest(arr);
        System.out.println(sl);
    }
}