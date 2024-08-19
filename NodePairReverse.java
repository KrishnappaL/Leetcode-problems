package code2;
import code2.ListNode;
public class NodePairReverse {
	public static void main(String[] args) {
		ListNode node=new ListNode(2);
		node.next=new ListNode(3);
		node.next.next=new ListNode(4);
		swapPairs(node);
		
		
		
	}
		    public static ListNode swapPairs(ListNode head) {
		        if (head == null || head.next == null) {
		            return head;
		        }
		        ListNode t = swapPairs(head.next.next);
		        ListNode p = head.next;
		        p.next = head;
		        head.next=t;
		        return p;
		    }
		}

