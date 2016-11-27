import java.util.List;
import java.util.ArrayList;

public class Test{
	public static void main(String[] args){
		Solution sol = new Solution();
		int [] set = {1, 2, 3};
		List<List<Integer>> subsets = sol.subsets(set);
		System.out.print("[");
		for(List l : subsets){
			System.out.print(" [");
			for(Object i : l){
				System.out.print(i + " ");
			}
			System.out.print("]");
		}
		System.out.println(" ]");
	}
}