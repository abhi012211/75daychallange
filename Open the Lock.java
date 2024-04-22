class Solution {
    public int openLock(String[] deadends, String target) {
        Set<String> dead=new HashSet<>(Arrays.asList(deadends));
        Set<String> vis=new HashSet<>();
        Queue<String> queue=new LinkedList<>();
        queue.offer("0000");
        vis.add("0000");
        int lvl=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                String curr=queue.poll();
                if(dead.contains(curr)) continue;
                if( curr.equals(target)) return lvl;

                for(int j=0;j<4;j++){
                    char[] currArr=curr.toCharArray();
                    char ori=currArr[j];
                    currArr[j]=(char)((currArr[j]-'0'+1)%10+'0');
                    String next=new String(currArr);
                    if(!vis.contains(next) && !dead.contains(next)){
                        queue.offer(next);
                        vis.add(next);
                    }
                    currArr[j]=ori;
                    currArr[j]=(char)((currArr[j]-'0'+9)%10+'0');
                    next=new String(currArr);
                    if(!vis.contains(next) && !dead.contains(next)){
                        queue.offer(next);
                        vis.add(next);
                    }
                    currArr[j]=ori;
                }
            }
            lvl++;
        }
        return -1;
    }
}
