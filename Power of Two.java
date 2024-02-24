class Solution {
    public boolean isPowerOfTwo(int n) {
       int i=0;
       while(Math.pow(2,i)<n){
           i++;
       }
       return Math.pow(2,i)==n;

    }
}
