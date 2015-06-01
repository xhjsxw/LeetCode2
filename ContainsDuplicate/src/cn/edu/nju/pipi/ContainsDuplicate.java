package cn.edu.nju.pipi;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {

	}

	public static boolean containsDuplicate(int[] nums) {

		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0;i < nums.length;i ++){
			if(set.contains(nums[i])){
				return true;
			}
			set.add(nums[i]);
		}
		
		return false;
		
	}

}
