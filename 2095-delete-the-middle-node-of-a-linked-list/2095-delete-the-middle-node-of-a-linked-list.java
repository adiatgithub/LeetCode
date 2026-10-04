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

    public int findSize(ListNode head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }return count;
    }
    public ListNode deleteMiddle(ListNode head) {
        if(head==null|| head.next==null){
            return null;
        }
        int middle= findSize(head)/2;

        ListNode curr=head;
        for(int i=0;i<middle-1;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
            return head;

    }
}