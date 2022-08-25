package Algorithms_and_DS.LinkedList;

import java.util.Stack;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        // find if linked list is Palindrome
        //[1,2,2,1] or [1,2]


    }
        public boolean isPalindrome(ListNode head) {
            Stack<Integer> nums = new Stack<>();

            while(head!=null){
                if(nums.isEmpty()){
                    nums.add(head.val);
                    System.out.println("Initiate stack");
                    print(nums);
                }else if(nums.peek()!=head.val){
                    nums.add(head.val);
                    System.out.println("Add into the stack");
                    print(nums);
                }else if(nums.peek()==head.val){
                    nums.pop();
                    System.out.println("Delete from the stack");
                    print(nums);

                }
                head = head.next;
            }

            return nums.isEmpty();

        }

    public void print(Stack<Integer> st) {
        if (st.isEmpty()) {
            System.out.println("Is EMPTY!");

        } else {

            for (Integer i : st) {
                System.out.println(i);
            }

        }
    }
}
