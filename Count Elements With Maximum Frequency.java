class Solution {
    public int maxFrequencyElements(int[] nums) {
        int arr[]=new int[101];
        int max=0;
        int sum=0;
        for(int element:nums){
            arr[element]++;
            int curr=arr[element];
            if(curr>max){
                max=curr;
                sum=curr;
            }else if(curr==max){
                sum+=curr;
            }
        }
        return sum;
    }
}
