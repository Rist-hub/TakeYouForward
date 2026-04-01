public class RotateByK{
    public static int[] rotate(int[] arr, int k, String direction){
        int l=1;
        if(direction=="left"){
            while(l<=k){
                int temp = arr[0];
                for(int i=1; i<arr.length; i++){
                    arr[i-1]=arr[i];
                }
                arr[arr.length-1] = temp;
                l++;
            }
        }
        else if(direction=="right"){
            while(l<=k){
                int temp = arr[arr.length-1];
                for(int i=arr.length-2; i>=0; i--){
                    arr[i+1]=arr[i];
                }
                arr[0] = temp;
                l++;
            }
        }else{
            System.out.println("Enter either 'left' OR 'right'");
        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr = {3,4,5,8,1,9};
        int[] newArr = rotate(arr,2,"right");
        for(int in : newArr){
            System.out.print(in+", ");
        }
    }
    
}