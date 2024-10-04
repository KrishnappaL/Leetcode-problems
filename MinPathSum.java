public class MinPathSum {
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
       /* head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);*/
        reverseKGroup(head,2);
    }
    public static ListNode reverseKGroup(ListNode head, int k) {
        int n = 0;
        for (ListNode i = head; i != null; n++, i = i.next){

        }
        ListNode dmy = new ListNode(0);
        dmy.next = head;
        for(ListNode prev = dmy, tail = head; n >= k; n -= k) {
            for (int i = 1; i < k; i++) {
                ListNode next = tail.next.next;
                tail.next.next = prev.next;
                prev.next = tail.next;
                tail.next = next;
            }
            prev = tail;
            tail = tail.next;
        }
        return dmy.next;
    }
    }