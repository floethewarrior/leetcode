import java.util.*;

public class Test{
	public static void main(String[] args){
		int [][] dimmensions = {{2, 9, 10},{3, 7, 15}, {5, 12, 12}, {15, 20, 10}, {19, 24, 8}};
		Solution sol = new Solution();
		List<int[]> skyline = sol.getSkyline(dimmensions);
		System.out.print("[ ");
		for(int [] b : dimmensions){
			System.out.print("[");
			for(int i : b){
				System.out.print(i + " ");
			}
			System.out.print("]");
		}
		System.out.println("]");
	
		System.out.print("[ ");
		for(int [] b : skyline){
			System.out.print("[");
			for(int i : b){
				System.out.print(i + " ");
			}
			System.out.print("]");
		}
		System.out.println("]");
			
	}
}