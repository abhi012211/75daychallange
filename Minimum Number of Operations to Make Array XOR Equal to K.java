class Solution {
    public int minOperations(int[] nums, int k) {
        int result=0;
        for(int x:nums){
            result=result^x;
        }
        result=result^k;
        int a=0;
        while(result>0){
            if((result & 1)!=0){
                a++;
            }
            result=result>>1;
        }
        return a;
    }
}
