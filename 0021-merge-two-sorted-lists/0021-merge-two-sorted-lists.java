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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode head = dummy;
        while(list1 != null || list2 != null)
        {
            int x = (list1 != null)? list1.val : 101;
            int y = (list2 != null)? list2.val : 101;
            if(x<=y)
            {
               ListNode temp = new ListNode(x);
               head.next = temp;
               list1 = list1.next;
               head = head.next;
            }
            else
            {
                ListNode temp = new ListNode(y);
                head.next = temp;
                list2 = list2.next;
                head = head.next;
            }
        }
        return dummy.next;
    }
}