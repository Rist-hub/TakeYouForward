public class LongestSubarraySum{
    public static int longestSub(int[] nums, int k){
        int max = 0;
        if(nums.length>1){
            for(int i=0; i<nums.length; i++){
                int count = 0, sum = 0;
                for(int j=i+1; j<nums.length; j++){
                    if(sum!=k){
                        sum = nums[i]+nums[j];                    
                        count++;
                        continue;
                    }
                }
                if(max<count){
                    max = count;
                }
            }
        }
        else{
            return 0;
        }

        return max;
    }

    public static void main(String[] args){
        int[] arr = {2,1,2,3,6,1,1};
        int maxSub = longestSub(arr,4);
        System.out.println(maxSub);
    }
}