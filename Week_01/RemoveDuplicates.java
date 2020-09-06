package Java.week_1.Homework;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums={1,1,2};
        int i=removeDuplicates(nums);
        System.out.println(i);
    }
    public static int removeDuplicates(int[] nums) {
        if(nums==null||nums.length==0) return 0;
        int p=0;
        int q=1;
        while(q<nums.length){
            if(nums[p]!=nums[q]){
                nums[p+1]=nums[q];
                p++;
            }
            q++;
        }
        return p+1;
    }
}