package Java.week_2;
import java.util.PriorityQueue;
public class MaxSlidingWindow {
    public static void main(String[] args) {
        int[] nums={1,3,-1,-3,5,3,6,7};
        int k=3;
        int[] arr=maxSlidingWindow(nums, k);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] maxSlidingWindow(int[] nums,int k){
        if(nums.length==0||k==0){
            return new int[0];
        }
        int n=nums.length;
        int[] result=new int[n-k+1];
        PriorityQueue<Integer> maxPQ=new PriorityQueue<>((o1,o2)
        ->(o2-o1));
        for(int i=0;i<n;++i){
            int start=i-k;
            if(start>=0){
                maxPQ.remove(nums[start]);
            }
            maxPQ.offer(nums[i]);
            if(maxPQ.size()==k){
                result[i-k+1]=maxPQ.peek();
            }
        }
        return result;
    }
}