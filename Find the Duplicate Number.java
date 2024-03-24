class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] bol=new boolean[nums.length];
        for(int num:nums){
            if(bol[num]){
                return num;
            }
            bol[num]=true;
        }
        return 0;

    }
}
