public class Test{

	public static void main(String[] args){
		LRUCache lru = new LRUCache(2);
		lru.set(1, 2);
		lru.set(2, 4);
		System.out.println("LRU get 1: " + lru.get(1));
		lru.set(3,5);
		System.out.println("LRU get 2: " + lru.get(2));

	}
}