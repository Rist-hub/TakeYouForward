public class MoveZeroesToEnd{
    public static void move(int[] nums){
        int j = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1) return;
        for(int i=j+1; i<nums.length; i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        for(int k=0; k<nums.length;k++){
            System.out.print(nums[k]+", ");
        }
    }

    public static void main(String[] args){
        int[] arr = {0,2,13,0,0,4,9,0};
        move(arr);
    }
}