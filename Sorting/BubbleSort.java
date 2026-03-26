public class BubbleSort{
    public static int[] sort(int[] arr){
        int range = 0;
        for(int i=arr.length-range-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            range++;
        }
        return arr;
    }

    public static void main(String[] args){
        int[] array = {7,3,6,2,9,4,10,4,-5};
        int[] newArray = sort(array);
        for(int i=0; i<newArray.length; i++){
            System.out.print(newArray[i]+", ");
        }
    }
}