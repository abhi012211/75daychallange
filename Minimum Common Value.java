class Solution {
    public int getCommon(int[] nums1, int[] nums2) {

        HashSet<Integer> hash=new HashSet<>();
        for(int element:nums1){
            hash.add(element);
        }
        for(int ans:nums2){
            if(hash.contains(ans)){
                return ans;
            }
        }
        return -1;





        // for(int i=0;i<nums1.length;i++){
        //     for(int j=0;j<nums2.length;j++){
        //         if(nums1[i]==nums2[j]){
        //             return nums1[i];
        //         }
        //     }
        // }
        // return -1;
    }
}
