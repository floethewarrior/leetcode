import java.util.*;
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i ++){
			Object pair = map.get(target - nums[i]);
        	if(pair != null && (int)pair != i){
        		int [] ret = {(int)pair, i};
        		return ret;
        	}
        	map.put(nums[i], i);
        }
        System.out.println("error");
        int [] ret = {0,0}; //error
        return ret;
    }
}