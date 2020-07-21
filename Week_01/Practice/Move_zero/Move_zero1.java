public class Move_zero1 {
    public static void moveZeroes(int[] nums){
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums.length==0){
                return;
            }
            if(nums[i]!=0){
                nums[j]=nums[i];
               j++;
                //nums[j++]=nums[i]  时间和空间复杂度都更加高
            }
        }
        for(int a=j;a<nums.length;a++){
            nums[a]=0;
        }
    }
}