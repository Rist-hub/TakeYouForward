public class MaxConsecutiveOnes{
    public static int count(int nums[]){
        int max = 0, count = 0;
        for(int i=0; i<nums.length; i++){
            int j = 0;
            while((nums[i+j])!=0){
                count++;
                j++;
            }
            if(max<count){
                max = count;
            }
            count = 0;
        }

        return max;
    }

    public static void main(String[] args){
        int[] arr = {0,0,1,1,0,0,0,1,0,0,1,1,1,1,0};
        int max = count(arr);
        System.out.println(max);
    }
}