class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode a=head;
        ListNode b=head;
        while(b!=null && b.next!=null){
            a=a.next;
            b=b.next.next;
        }
        return a;
        // int count=0;
        // ListNode curr=head;
        // while(curr!=null){
        //     count++;
        //     curr=curr.next;
        // }
        // curr=head;
        // for(int i=0;i<count/2;i++){
        //     curr=curr.next;
        // }
        // return curr;
        
    }
}
