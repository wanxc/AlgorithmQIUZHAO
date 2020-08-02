package Java.week_3;

public class CanJump {
    public static void main(String[] args) {
        int[] nums={2,3,1,1,4};
        boolean result=canJump(nums);
        System.out.println(result);
    }
    public static boolean canJump(int[] nums){
        if(nums==null){
            return false;
        }
        int endReachable=nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]+i>=endReachable){
                endReachable=i;
            }
        }
        return endReachable==0;
    }
}