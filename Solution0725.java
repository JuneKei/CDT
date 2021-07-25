package july;

public class Solution0725 {
    public int solution(int[] nums) {
    	int answer=0;
	for(int i=0;i<nums.length-2;i++) {	
		for(int j=i+1;j<nums.length-1;j++) {
			for(int k=j+1;k<nums.length;k++) {
				if(cal(nums[i]+nums[j]+nums[k])) answer++;			                    
				//모든 조합 계산
			}
		}
	}
      return answer;
}

public static boolean cal(int sum) {
    //자기 자신 나누는거 하나인 소수판별기
	int cnt = 0 ;
	for(int i=1;i<sum;i++) {
		if(sum%i==0) {
			cnt++;
		}
	}
	if(cnt ==1) {
		return true;			
	}else {
		return false;
	}
}

}