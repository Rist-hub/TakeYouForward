

public class RemoveDuplicates{
    public static void main(String[] args){
        int[] arr = {1,2,3,3,4,4,4,4,5,6,7};
        int max =0;

        // Collection<Integer> unique = new TreeSet();
        
        // for(int i=0; i<arr.length; i++){
        //     unique.add(arr[i]);
        // }

        // for(Integer u: unique){
        //     System.out.print(u+", ");
        // }

        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }   
        }

        int[] hashArr = new int[max+1];
        for(int j=0; j<hashArr.length; j++){
            for(int i=0; i<arr.length; i++){
                if(j==arr[i]){
                    hashArr[arr[i]] = hashArr[arr[i]]+1;
                }
            }
        }
        for(int k=0; k<hashArr.length; k++){
            // System.out.print(k+"  ");
            // System.out.println(hashArr[k]+", ");
            int count = 0;
            if(hashArr[k]>1){
                count = hashArr[k];
                for(int m=0; m<arr.length; m++){
                    if(k==arr[m]){
                        for(int n=1; n<=count-1; n++){
                            arr[m+n]=0;
                        }
                    }
                }
            }
        }

        int[] outputArr = new int[arr.length];
        int index = 0, countZero=0;
        for(int m=0; m<arr.length; m++){
            if(arr[m]!=0){
                // System.out.print(arr[m]+", ");
                outputArr[index] = arr[m];
                index++;
            }else{
                countZero++;
            }
            
        }

        for(int z=0; z<outputArr.length-countZero; z++){
            System.out.print(outputArr[z]+", ");
        }

    }
}