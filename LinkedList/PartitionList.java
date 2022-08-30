package Algorithms_and_DS.LinkedList;

public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode first = head;
        ListNode second = head;
        ListNode temp = first;

        //find a node with x value
        while (first.val != x) {
            first = first.next;

        }
        //iterate until the end of the list
        while (first != null) {
            if (first.next.val <= x) {
                temp = first.next;
                first.next = first.next.next;

                temp.next = second.next;
                second.next = temp;
                temp = temp.next;

            }
            first = first.next;

        }
        return head;
    }
}
