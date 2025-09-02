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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> p=new PriorityQueue<>();
        for(int i=0;i<lists.length;i++){
            ListNode temp=lists[i];
            while(temp!=null){
                p.offer(temp.val);
                temp=temp.next;
            }
        }
            ListNode temp=new ListNode();
            ListNode point=temp;
            while(!p.isEmpty()){
                ListNode newNode = new ListNode(p.poll());
                
                temp.next=newNode;
                temp=temp.next;
            }
            return point.next;
        
    }
}