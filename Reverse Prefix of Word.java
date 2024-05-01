class Solution {
    public String reversePrefix(String word, char ch) {
        int i=word.indexOf(ch)+1;
        StringBuffer sb=new StringBuffer(word.substring(0,i));
        return sb.reverse()+word.substring(i);
    }
}
