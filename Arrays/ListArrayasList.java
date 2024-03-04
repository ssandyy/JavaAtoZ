package Arrays;

import java.util.Arrays;
import java.util.List;

public class ListArrayasList {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 4,2 , 7,4,9,2);
		
		/*
		 * for(int i=0; i<nums.size();i++) { System.out.println(nums.get(i)); }
		 */
		
//  -----------------    OR   ------------------------
		
		/*
		 * for(int n : nums) { System.out.println(n); }
		 */
		
//  -----------------    OR   ------------------------
		
		nums.forEach(n -> System.out.println(n));
	}
}
