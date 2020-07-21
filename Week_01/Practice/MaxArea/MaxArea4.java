public class MaxArea4 {
    public int maxArea(int[] a){
        int max=0;
        for(int i=0,j=a.length-1;i<j;){
            int minHeight=a[i]<a[j]?a[i++]:a[j--];
            int area=(j-i+1)*minHeight;
            max=Math.max(max,area);
        }
        return max;
    }
}