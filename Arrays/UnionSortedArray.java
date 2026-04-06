public class UnionSortedArray{
    public static void union(int[] arr1, int[] arr2){
        int[] union = new int[arr1.length + arr2.length];
        int index = 0,j=0, i =0;
        for(; j<arr1.length && i<arr2.length; ){
            System.out.println("arr2[i] outside if: "+arr2[i]);
            if(arr1[j]<=arr2[i]){
                union[index] = arr1[j];    
                System.out.println("arr1[j] : "+arr1[j]);
                j++;
            }else{
                union[index] = arr2[i];
                System.out.println("arr2[i] : "+arr2[i]);
                i++;
            }
            index++;
        }

        while(j<arr1.length){
            union[index] = arr1[j];
            j++;
            index++;
        }

        while(i<arr2.length){
            union[index] = arr2[i];
            i++;
            index++;
        }

        for(int u=0; u<union.length; u++){
            System.out.print(union[u]+", ");
        }
    }

    public static void main(String[] args){
        int[] arr1 = {1,2,4,6};
        int[] arr2 = {3,5,7,8,9};

        union(arr1, arr2);
    }
}