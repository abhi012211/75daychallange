class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int num=Math.abs(nums[i]);
            int x=num-1;
            if(nums[x]<0)
                result.add(num);
            nums[x]*=-1;    
        }
        return result;
    }
}
