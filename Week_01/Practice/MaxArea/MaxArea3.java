public class MaxArea3 {
    public int maxArea(int[] a){
        int max=0;
        for(int i=0;i<a.length;++i){
            for(int j=i+1;j<a.length;++j){
                int area=(j-i)*Math.min(a[i],a[j]);
                max=Math.max(max,area);
            }
        }
        return max;
    }
}