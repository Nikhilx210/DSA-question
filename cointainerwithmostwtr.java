public class cointainerwithmostwtr {
    public int maxArea(int[] height) {
        int z=height.length;
        int i=0;
        int j=z-1;
        int ans = Integer.MIN_VALUE;
        while(i<j){
            ans=Integer.max(ans,(j-i)*(Integer.min(height[i],height[j])));
            if(height[i]<=height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return ans;
    } 
}
