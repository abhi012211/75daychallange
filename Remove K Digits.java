class Solution {
    public String removeKdigits(String num, int k) {
        int top=-1;
        int n=num.length();
        int start=0;
        int digit=num.length()-k;
        if(n==k){
            return "0";
        }
        char[] ch=num.toCharArray();
        for(int  i=0;i<n;i++){
            while(top>=0 && ch[top]>ch[i] && k>0){
                top--;
                k--;
            }
            top++;
            ch[top]=ch[i];
        }
        while(start<=top && ch[start]=='0'){
            start++;
        }
        String str=new String(ch);
        return (start>=digit)?"0":str.substring(start,digit);
    }
}
