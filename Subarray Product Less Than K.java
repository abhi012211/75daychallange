class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int i=0,j=0,result=0,n=nums.length,pro=1;;
        while(j<n){
            pro*=nums[j];
            while(i<=j && pro>=k){
                pro=pro/nums[i];
                i++;
            }
            result+=(j-i+1);
            j++;
        }
        return result;
    }
}
