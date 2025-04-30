/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode temp = new ListNode(0);
        ListNode dummy = temp;
        while(l1 != null || l2 != null)
        {
            int x = (l1!=null)? l1.val:0;
            int y = (l2!=null)? l2.val:0;
            int sum = carry + x + y;
            carry = sum/10;
            dummy.next = new ListNode(sum%10);
            dummy = dummy.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if(carry>0)
        {
            dummy.next = new ListNode(carry);
        }
        return temp.next;
    }
}