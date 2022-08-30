package Algorithms_and_DS.LinkedList;

public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode first = head;
        ListNode second = head;
        ListNode temp = first;


        while(second.next!=null|| first!=null){
            if(first.val == x){
                if(first.next.val<= x){
                    temp = first.next;
                    first.next = first.next.next;

                    temp.next = second.next;
                    second.next = temp;
                    temp= temp.next;

                }
            }
    }
}
