// problem : 1290

// Input: head = [1,0,1]
// Output: 5
// Explanation: (101) in base 2 = (5) in base 10


//  * Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public int getDecimalValue(ListNode head) {
        int res=0;
        while(head!=null)
        {
            res=res<<1 | head.val;
            head=head.next;
        }
        return res;
    }
}
// 0 << 1 = 00 or 1 => 1 << 1 = 10 or 0 => 10 << 1 = 100 or 1 => 101
