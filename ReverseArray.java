public class ReverseArray{
    public static int[] revArray(int size, int[] arr){
        int[] revArr = new int[size];
        int sizeTemp = size;
        if(size<=1){
            return arr;
        }
        else{
            for(int i=0; i<size; i++){
                revArr[i] = arr[sizeTemp-1];
                sizeTemp--;
            }
        }
        return revArr;
    }

    public static void main(String[] args){
        int[] userArray = {4,1,8,2,6};
        int size = 5;
        int[] reversed =  revArray(size,userArray);
        System.out.print("{");
        for(int i=0; i<size; i++){
            System.out.print(reversed[i]+", ");
        }
        System.out.print(" }");
    }
}