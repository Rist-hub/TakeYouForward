public class IntersectSortedArrays{

    public static int[] intersect(int[] arr1, int[] arr2){
        int[] finalArr = new int[arr1.length + arr2.length];
        int index = 0;
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i]==arr2[j]){
                    finalArr[index] = arr1[i];
                    index++;
                    break;
                }
            }
        }

        return finalArr;
    } 

    public static void main(String[] args){
        int[] arr1 = {2,5,6,7,12};
        int[] arr2 = {1,3,5,7,11};
        int[] finalArr = intersect(arr1, arr2);
        for(int k=0; k<finalArr.length; k++){
            System.out.print(finalArr[k]+",");
        }
    }
}