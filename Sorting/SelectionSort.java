public class SelectionSort{
    public static int[] sort(int[] arr){
        int range = 0;
        for(int i=0; i<arr.length; i++){
            int min = Integer.MAX_VALUE, index = 0 ;
            for(int j=range; j<arr.length; j++){
                if(min>arr[j]){
                    min = arr[j];
                    index = j;
                }
            }
            range++;
            int temp = arr[i];
            arr[i] = min;
            arr[index] = temp;
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