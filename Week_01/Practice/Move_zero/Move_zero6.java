public class Move_zero6 {
    public void moveZeroes(int[] nums){
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
            nums[j]=nums[i];
            if(i!=j){
                nums[i]=0;
            }
        }
        }
    }
}