public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        ListNode s1=head;
        ListNode s2=head.next;
        while(true){
            if(s2==null || s1==null || s2.next==null){
                return false;
            }else if(s1==s2){
                return true;
            }
            s1=s1.next;
            s2=s2.next.next;
        }
        
    }
}
