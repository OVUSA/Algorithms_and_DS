package Algorithms_and_DS.LinkedList;

import java.util.Stack;

public class PalindromeLinkedList {
    public static void main(String[] args) {
// the palindrome is something START and ENDS the same way ,


    }
        public boolean isPalindrome(ListNode head) {
            Stack<Integer> nums = new Stack<>();

            ListNode temp = head;
            while(temp!=null){
                nums.add(temp.val);
                temp = temp.next;
            }

            temp = head;
            while(temp!=null){
                if(temp.val != nums.peek()){
                    return false;
                }else{
                    nums.pop();
                }
                temp= temp.next;
            }

            return true;
        }

}
