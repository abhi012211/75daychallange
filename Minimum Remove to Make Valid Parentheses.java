class Solution {
    public String minRemoveToMakeValid(String s) {
        HashSet<Integer> set=new HashSet<>();
        ArrayDeque<Integer> deque=new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                deque.push(i);
            }else if(s.charAt(i)==')'){
                if(deque.isEmpty()){
                    set.add(i);
                }else{
                    deque.pop();
                }
            }
        }
        while(!deque.isEmpty()){
            set.add(deque.pop());
        }

        StringBuilder result=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(!set.contains(i)){
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}
