

public class HighestOccuringElement{
    public static void main(String[] args){
        int[] arr = {3, 4, 7, 1, 11, 15, 24, 9, 3, 11, 7, 9, 1, 9, 15, 4};
        freqOfEl_hash(arr);
    }

    public static void freqOfEl_hash(int[] arr){
        int max = 0;
        for(int m=0; m<arr.length; m++){
            if(max<arr[m]){
                max = arr[m];
            }
        }
        int[] hashArr = new int[max+1];
        for(int i = 0; i<arr.length; i++){
            hashArr[arr[i]] +=1;
        }
        int high =0, low =0, index1=0,index2=0;
        for(int i = 0; i<hashArr.length; i++){
            if(high<hashArr[i]){
                high = hashArr[i];
                index1 = i;
            }
        }
        low = max;
        for(int i = 0; i<hashArr.length; i++){
            if(hashArr[i]!=0){
                if(low>hashArr[i]){
                    low = hashArr[i];
                    index2 = i;
                }
            }
        }
        

        System.out.println(high+" "+index1);
        System.out.println(low+" "+index2);
    }
}