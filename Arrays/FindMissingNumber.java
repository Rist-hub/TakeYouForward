public class FindMissingNumber{
    public static int find(int[] nums){
        int max = 0, missing = 0, hashIndex = 0;

        for(int i=0; i<nums.length; i++){
            if(max<nums[i]){
                max = nums[i];
            }
        }

        int[] hashArr = new int[max+1]; 
        for(int h=0; h<nums.length; h++){
            hashArr[nums[h]] += 1; 
        }

        for(int m=1; m<hashArr.length; m++){
            if(hashArr[m]==0){
                missing = m;
            }
        }

        return missing;    
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,7,8,6,10,12,13,9};
        int m = find(arr);
        System.out.println("Missing Number : "+m);
    }
}