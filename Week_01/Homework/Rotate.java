package Java.week_1.Homework;

public class Rotate {
    public void rotate(int[] nums,int k){
        int temp,previous;
        for(int i=0;i<k;i++){
            previous=nums[nums.length-1];
            for(int j=0;i<nums.length;j++){
                temp=nums[j];
                nums[j]=previous;
                previous=temp;
            }
        }
    }
}