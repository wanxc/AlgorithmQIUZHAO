public class MaxArea {
    public int maxArea(int[] height){
        int maxArea=0;
        //注意可能数组会越界
        for(int i=0;i<height.length-1;i++){
            if(height[i]>height[i+1]){
                //面积是长乘以宽
                int area=height[i+1]*height[i+1];
                maxArea=Math.max(area,maxArea);
            }else{
                int area=height[i]*height[i];
                maxArea=Math.max(area,maxArea);
            }
        }
        return maxArea;
    }
}