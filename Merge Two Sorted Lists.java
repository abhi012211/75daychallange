class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode a=new ListNode(0);
        ListNode b=a;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                b.next=list1;
                list1=list1.next;
            }else{
                b.next=list2;
                list2=list2.next;
            }
            b=b.next;
        }
        if(list1!=null){
            b.next=list1;
            list1=list1.next;
        }
        if(list2!=null){
            b.next=list2;
            list2=list2.next;
        }
        return a.next;
    }
}
