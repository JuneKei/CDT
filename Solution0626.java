package codingtest;

public class Solution0626 {
	
	  public long[] solution(long x, int n) {
			//x가 9,999,999 이고 n 999 일때 int 범위를 넘을수 있다.
		  
			long[] answer= new long[n];
			//long 배열 가져온다.  n개를 담을 수 있는 배열
		
			
			for (int i = 0; i < n; i++) {
				answer[i] = x * (i+1);
			// x가 고정이지만 (i+1)로 x의 2... 3...배를 시켜준다.	
			}
		
			return answer;
			
		}

	}