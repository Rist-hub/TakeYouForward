public class MajorityElement1{

    public static int Majority(int[] arr){
        int major = 0;
        int count = 0;
        if(arr.length==1){
            major = arr[0];
        }
        else{
            for(int i=0; i<arr.length; i++){
                for(int j=i; j<arr.length && i!=arr.length-1; j++){
                    if(arr[i]==arr[j]){
                        count++;
                    }
                }
                if(count>(arr.length/2)){
                    major = arr[i];
                }
                count=0;
            }
        }
        return major;
    }

    public static void main(String[] args){
        int[] arr = {5,5,7,5,1,5};
        int major = Majority(arr);
        System.out.println(major);
    }
}