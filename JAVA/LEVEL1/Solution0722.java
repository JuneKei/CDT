package july;

import java.util.ArrayList;

public class Solution0722 {
    public int solution(int left, int right) {
        int cnt = 0;
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=left;i<=right;i++) {
		    for(int j=1;j<=i;j++) {
			    if(i%j==0) {
			    	cnt++;
			    }
		    }
        answer += (cnt%2==0) ?  i : -i ;
        cnt=0;
	    }
        return answer;
    }
}