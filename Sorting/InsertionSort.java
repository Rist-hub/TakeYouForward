public class InsertionSort{
    //----------------------SORT Method----------------------
    public static int[] sort(int[] arr){
        for(int i=1; i<arr.length-1; i++){
            int selected = 0, index = 0;
            selected = arr[i];

            for(index=i-1; index>=0 && arr[index]>selected; index--){
                arr[index+1] = arr[index];
            }
            System.out.println(index);
            arr[index+1] = selected;
        }

        return arr;
    }

    //----------------------MAIN Method----------------------
    public static void main(String[] args){
        int[] array = {7,3,6,2,9,4,10,4,-5};
        int[] newArray = sort(array);
        for(int i=0; i<newArray.length; i++){
            System.out.print(newArray[i]+", ");
        }
    }
}