package Level1;

public class Solution210725 {
    public int solution(int[] nums) {
    	int answer=0;
	for(int i=0;i<nums.length-2;i++) {	
		for(int j=i+1;j<nums.length-1;j++) {
			for(int k=j+1;k<nums.length;k++) {
				if(cal(nums[i]+nums[j]+nums[k])) answer++;			                    
				//��� ���� ���
			}
		}
	}
      return answer;
}

public static boolean cal(int sum) {
    //�ڱ� �ڽ� �����°� �ϳ��� �Ҽ��Ǻ���
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