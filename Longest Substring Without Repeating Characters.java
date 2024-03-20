class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null || s.isEmpty()){
            return 0;
        }
        int max=0;
        HashMap<Character,Integer> map=new HashMap<>();
        int start=0;
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if(map.containsKey(curr)){
                start=Math.max(start,map.get(curr)+1);
            }
            map.put(curr,i);
            max=Math.max(max,i-start+1);
        }
        return max;

    }
}
