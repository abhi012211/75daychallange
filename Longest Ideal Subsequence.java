class Solution {
    public int longestIdealString(String s, int k) {
        int n=s.length(),ans=0;
        int[] arr=new int[26];
        for(int i=0;i<n;i++){
            int curr=s.charAt(i)-'a';
            int left=Math.max(0,curr-k);
            int right=Math.min(25,curr+k);
            int longest =0;
            for(int j=left;j<=right;j++){
                longest=Math.max(longest,arr[j]);
            }
            arr[curr]=Math.max(longest+1,arr[curr]);
            ans=Math.max(ans,arr[curr]);
        }
        return ans;
    }
}
