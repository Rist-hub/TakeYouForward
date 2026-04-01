public class RotateByK{
    public static int[] rotate(int[] arr, int k, String direction){
        int l=1;
        if(direction=="left"){
            while(l<=k){
                int temp = arr[0];
                System.out.println("------------------------------ "+l);
                for(int i=1; i<arr.length; i++){
                    arr[i-1]=arr[i];
                    System.out.println("arr[i-1] : "+arr[i-1]);
                }
                arr[arr.length-1] = temp;
                System.out.println("arr[arr.length-1] : "+arr[arr.length-1]);
                l++;
            }
        }
        else if(direction=="right"){
            while(l<=k){
                int temp = arr[arr.length-1];
                System.out.println("------------------------------ "+l);
                for(int i=arr.length-2; i>=0; i--){
                    arr[i+1]=arr[i];
                    System.out.println("arr[i+1] : "+arr[i+1]);
                }
                arr[0] = temp;
                System.out.println("arr[0] : "+arr[0]);
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