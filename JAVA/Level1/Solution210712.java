package Level1;

public class Solution210712 {
    public long solution(int a, int b) {
        long answer = 0;
        if(a==b) {
			answer=a;
		}else {
			for(int i=Math.min(a, b);i<=Math.max(a, b);i++) {
			answer +=i;
			}
		}
        return answer;
    }
}