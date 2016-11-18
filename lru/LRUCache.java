import java.util.Hashtable;

public class LRUCache {

	class DLLNode {
		int key;
		int value;
		DLLNode pre;
		DLLNode post;
	}

	/**
	 * Always add the new node right after head;
	 */
	private void addNode(DLLNode node){
		node.pre = head;
		node.post = head.post;
		
		head.post.pre = node;
		head.post = node;
	}

	/**
	 * Remove an existing node from the linked list.
	 */
	private void removeNode(DLLNode node){
		DLLNode pre = node.pre;
		DLLNode post = node.post;
		
		pre.post = post;
		post.pre = pre;
	}

	/**
	 * Move certain node in between to the head.
	 */
	private void moveToHead(DLLNode node){
		this.removeNode(node);
		this.addNode(node);
	}

	// pop the current tail. 
	private DLLNode popTail(){
		DLLNode res = tail.pre;
		this.removeNode(res);
		return res;
	}

	private Hashtable<Integer, DLLNode> 
		cache = new Hashtable<Integer, DLLNode>();
	private int count;
	private int capacity;
	private DLLNode head, tail;

	public LRUCache(int capacity) {
		this.count = 0;
		this.capacity = capacity;

		head = new DLLNode();
		head.pre = null;
		
		tail = new DLLNode();
		tail.post = null;
		
		head.post = tail;
		tail.pre = head;
	}

	public int get(int key) {
	    
		DLLNode node = cache.get(key);
		if(node == null){
			return -1; 
		}
		
		// move the accessed node to the head;
		this.moveToHead(node);
		
		return node.value;
	}


	public void set(int key, int value) {
		DLLNode node = cache.get(key);
		
		if(node == null){
			
			DLLNode newNode = new DLLNode();
			newNode.key = key;
			newNode.value = value;
			
			this.cache.put(key, newNode);
			this.addNode(newNode);
			
			++count;
			
			if(count > capacity){
				// pop the tail
				DLLNode tail = this.popTail();
				this.cache.remove(tail.key);
				--count;
			}
		}else{
			// update the value.
			node.value = value;
			this.moveToHead(node);
		}
		
	}

}