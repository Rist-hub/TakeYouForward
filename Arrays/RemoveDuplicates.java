



public class RemoveDuplicates{

    public static int[] removeDuplicates(int[] arr) {
        int k = 1;
        // Set<Integer> uniqueSet = new TreeSet<Integer>();
        // for(int i=0; i<arr.length; i++){
        //     uniqueSet.add(arr[i]);
        // }

        // for(Integer j: uniqueSet){
        //     System.out.println(j);
        //     arr[k] = j;
            
        // }
        if (arr.length == 0){
            return arr;
        } 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[k] = arr[i];
                k++;
            }
        }
    return arr;
    }

    public static void main(String[] args){
        // int[] arr = {0,0,0,1,2,3,3,4,4,4,4,5,6,7};
        int[] arr = {-3,-3,-1,-1,0,0,0,0,0,2};
        int[] newArr = new int[arr.length];
        newArr = removeDuplicates(arr);
        for(int i=0; i<newArr.length; i++){
            System.out.print(newArr[i]+", ");
        }
        
        

        

    }
}