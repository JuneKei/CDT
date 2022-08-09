package Level1;

public class Solution210728 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int cnt = 0;
		int zeroCnt = 0 ;
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(lottos[i]==win_nums[j]) {
					cnt++;
				}
			}
			if(lottos[i]==0) {
				zeroCnt++;
			}
		}
		int[] answer = new int[2];
		for(int i=0;i<2;i++) {
		switch (cnt+zeroCnt) {
		case 6 : answer[i]=1; break;
		case 5 : answer[i]=2; break;
		case 4 : answer[i]=3; break;
		case 3 : answer[i]=4; break;
		case 2 : answer[i]=5; break;
		default:answer[i]=6; break;}
		zeroCnt=0;
		}
        return answer;
    }
}