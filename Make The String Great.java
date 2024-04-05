class Solution {
    public String makeGood(String s) {
        int n=s.length();
        ArrayDeque<Character> st=new ArrayDeque<>();
        String ans="";
        st.push(s.charAt(0));
        char[] ch=s.toCharArray();
        for(int i=1;i<n;i++){
            if(!st.isEmpty() && (st.peek()-ch[i]==32 || st.peek()-ch[i]==-32)){
                st.pop();
            }else{
                st.push(ch[i]);
            }
        }
        while(!st.isEmpty()){
            ans=st.pop()+ans;
        }
        return ans;
    }
}
