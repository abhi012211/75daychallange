class Solution {
    public int lengthOfLastWord(String s) {
        boolean start=false;
        int result=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                if(start){
                    break;
                }
            }else{
                start=true;
                result++;
            }
        }
        return result;
    }
}
