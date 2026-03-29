public class CheckSort{
    public static boolean checkSort(int[] arr){
        boolean flag = false;
        for(int i=0; i<arr.length-1; i++){
            flag = false;
            if(arr[i]<=arr[i+1]){
                flag = true;
            }else{
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args){
        // int[] arr = {3,9,2,1,4,6,8,7};
        int[] arr = {1,2,3,4,4,4,4,5,6,7};
        boolean l = checkSort(arr);
        System.out.println(l);
            
    }
}