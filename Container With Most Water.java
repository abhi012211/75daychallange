class Solution {
    public int maxArea(int[] height) {
        int ans=0;
        int a=0;
        int b=height.length-1;
        while(a<b){
            if(height[a]<height[b]){
                ans=Math.max(ans,height[a]*(b-a));
                a+=1;
            }else{
                ans=Math.max(ans,height[b]*(b-a));
                b-=1;
            }
        }
        return ans;
    }
}
