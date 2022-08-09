package Level1;

import java.util.Arrays;
public class Solution210723 {
    public int solution(int[] d, int budget) {
        int answer =0;
	    Arrays.sort(d);
        
        for(int i=0 ;  budget>=d[i] ;i++){
		budget -= d[i];
		answer++;
		if(i==d.length-1) break;
	}
        
        return answer;
    }
}
