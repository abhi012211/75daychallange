class Solution {
    public int findRotateSteps(String ring, String key) {
        char[] ch=ring.toCharArray();
        List<Integer>[] listarr=new List[26];
        for(int i=0;i<ch.length;i++){
            int a=ch[i]-'a';
            if(listarr[a]==null){
                listarr[a]=new ArrayList<>();
            }
            listarr[a].add(i);
        }
        int[][] dp=new int[key.length()][ch.length];
        return result(0,0,listarr,key.toCharArray(),ch,dp);
    }

    int result(int index,int pos,List<Integer>[] listarr,char[] key,char[] ring,int[][] dp){
        if(index==key.length){
            return 0;
        }
        if(dp[index][pos]>0){
            return dp[index][pos];
        }
        char target=key[index];
        List<Integer> posii=listarr[target-'a'];
        int minstep=Integer.MAX_VALUE;
        for(int next:posii){
            int step=Math.min(Math.abs(next-pos),ring.length-Math.abs(next-pos));
            int total=step+result(index+1,next,listarr,key,ring,dp);
            minstep=Math.min(minstep,total);
        }
        return dp[index][pos]=minstep+1;
    }
}
