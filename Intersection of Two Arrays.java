class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hash1=new HashSet<>();
        HashSet<Integer> hash2=new HashSet<>();

        for(int element:nums1){
            hash1.add(element);
        }
        for(int element:nums2){
            hash2.add(element);
        }

        hash1.retainAll(hash2);

        int arr[]=new int[hash1.size()];
        int a=0;
        for(int element:hash1){
            arr[a++]=element;
        }
        return arr;
        
    }
}
