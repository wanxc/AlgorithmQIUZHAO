public class MaxArea2 {
    public int maxArea(int[] height){
        int len = height.length;
        if(len<2){
            return 0;
        }
        int res=0;
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                res = Math.max(res,Math.min(height[i], height[j])*(j-i));
            }
        }
        return res;
    }
   
}