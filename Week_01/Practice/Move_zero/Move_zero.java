public class Move_zero {
    public static void moveZeroes(int[] nums){
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums.length==0){
                return;
            }
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }
        for(int a=j;a<nums.length;a++){
            nums[a]=0;
        }
    }
    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println("");
        moveZeroes(nums);
        for(int j=0;j<nums.length;j++){
            System.out.print(nums[j]+" ");
        }
    }
}