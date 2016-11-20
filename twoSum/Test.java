public class Test{
	public static void main(String[] args){
		Solution sol = new Solution();
		int [] nums = {0,4,3,0};
		int target = 0;
		int [] ret = sol.twoSum(nums, target);
		System.out.println("[" + ret[0] + ", " + ret[1] + "]");
	}
}