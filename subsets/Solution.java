import java.util.List;
import java.util.ArrayList;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        recurse(nums, nums.length - 1, result);
        return result;
        
    }

    private void recurse(int[] nums, int i, List<List<Integer>> result){
    	if(i < 0){ //base case, add empty set 
    		result.add(new ArrayList<Integer>());
    	}
    	else{
    		recurse(nums, i - 1, result);
    		int currentElements = result.size(); // combine next element with all previous iterations
    		for(int j = 0; j < currentElements; j++){
    			List<Integer> newSet = new ArrayList<Integer>();
    			newSet.addAll(result.get(j)); //get all previous sets
    			newSet.add(nums[i]); //add this elem to all previous sets
    			result.add(newSet); //add this new set to results
    		}
    	}
    }
}