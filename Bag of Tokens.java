class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int a=0;
        int start=0;
        int end=tokens.length-1;
        int max=0;
        while(start<=end){
            max=Math.max(max,a);
            if(tokens[start]<=power){
                power-=tokens[start];
                start++;
                a++;
            }else if(a>0){
                power+=tokens[end];
                end--;
                a--;
            }else{
                start++;
                end--;
            }
        }
        max=Math.max(max,a);
        return max;
    }
}
