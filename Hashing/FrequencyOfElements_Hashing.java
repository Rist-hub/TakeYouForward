

public class FrequencyOfElements_Hashing{
    public static void main(String[] args){
        int[] arr = {3, 4, 7, 1, 11, 15, 24, 9, 3, 11, 7, 9, 1, 9};
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

        for(int i = 0; i<hashArr.length; i++){
            if(hashArr[i]!=0){
                System.out.println(i+" "+hashArr[i]);
            }
        }
    }
}