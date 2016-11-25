public class Solution{

		public boolean isPalindrome(LinkedListNode head){
		LinkedListNode reverseHead = reverseAndClone(head);
		return isEqual(head, reverseHead);
	}

	private LinkedListNode reverseAndClone(LinkedListNode node){
		LinkedListNode head = null;
		while (node != null) {
			LinkedListNode n = new LinkedListNode(node.data);
			n.next = head;
			head = n;
			node = node.next;			
		}

		return head;
	}

	private boolean isEqual(LinkedListNode l1,LinkedListNode l2){
		if(l1 == null && l2 == null){
			return false;
		}
		else{
			while (l1 != null && l2 != null){
				if(l1.data != l2.data)
					return false;
				l1 = l1.next;
				l2 = l2.next;
			}
		}
		return true;
	}

}