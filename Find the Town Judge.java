class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] count=new int[n+1];
        for(int[] t:trust){
            count[t[0]]--;
            count[t[1]]++;
        }
        for(int i=1;i<=n;i++){
            if(count[i]==n-1){
                return i;
            }
        }
        return -1;
        // int lgh=trust.length;
        // if(lgh<n-1){
        //     return -1;
        // }
        // int[] inorder=new int[n+1];
        // int[] outorder=new int[n+1];
        // for(int i=0;i<lgh;i++){
        //     outorder[trust[i][0]]++;
        //     inorder[trust[i][1]]++;
        // }
        // for(int j=1;j<=n;j++){
        //     if(inorder[j]==n-1 && outorder[j]==0){
        //         return j;
        //     }
        // }
        // return -1;
        
    }
}
