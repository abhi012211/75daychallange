class Solution {
    public void reverseString(char[] s) {
        int n=0;
        int leng=s.length-1;
        while(n<=leng){
            char temp=s[n];
            s[n]=s[leng];
            s[leng]=temp;
            n++;
            leng--;
        }
    }
}
