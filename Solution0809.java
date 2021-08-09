package august;

import java.util.Arrays;

public class Solution0809 {
    public int solution(int[] nums) {
        Arrays.sort(nums);
		int cnt = 1;
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i]!=nums[i+1]) cnt++;
		}
		if(cnt>nums.length/2) cnt=nums.length/2;
        return cnt;
    }
}