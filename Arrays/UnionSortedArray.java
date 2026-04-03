public class UnionSortedArray{
    public static void union(int[] arr1, int[] arr2){
        int[] union = new int[arr1.length + arr2.length];
        int index = 0;
        for(int i=0; i<arr1.length; i++){
            for(int j=i+1; j<arr2.length; j++){
                if(arr1[i]<arr2[j]){
                    union[index] = arr1[i];
                    index++;
                }else{
                    union[index] = arr2[j];
                    index++;
                }
            }
        }


        for(int u=0; u<union.length; u++){
            System.out.print(union[u]+", ");
        }
    }

    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,6};
        int[] arr2 = {5,7,8,9};

        union(arr1, arr2);
    }
}