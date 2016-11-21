import java.util.*;

public class Solution {
	public List<int[]> getSkyline(int[][] buildings) {

	    List<int[]> height = new ArrayList<>();
	    for(int[] b:buildings) {
	        height.add(new int[]{b[0], -b[2]}); //set height to negative to denote start 
	        height.add(new int[]{b[1], b[2]});
	    }
	    Collections.sort(height, (a, b) -> { //sort by x, then height
	            if(a[0] != b[0]) 
	                return a[0] - b[0];
	            return a[1] - b[1];
	    });
	    Queue<Integer> pq = new PriorityQueue<>((a, b) -> (b - a)); 
	    pq.offer(0);
	    int prev = 0;

	    List<int[]> result = new ArrayList<>();
	    for(int[] h:height) {
	        if(h[1] < 0) { //start x
	            pq.offer(-h[1]);
	        } else {	//end x
	            pq.remove(h[1]);
	        }
	        int cur = pq.peek();
	        if(prev != cur) {
	            result.add(new int[]{h[0], cur});
	            prev = cur;
	        }
	    }
	    return result;
	}
}