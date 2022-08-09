package Level1;

public class Solution210626 {
	
	  public long[] solution(long x, int n) {
			//x�� 9,999,999 �̰� n 999 �϶� int ������ ������ �ִ�.
		  
			long[] answer= new long[n];
			//long �迭 �����´�.  n���� ���� �� �ִ� �迭
		
			
			for (int i = 0; i < n; i++) {
				answer[i] = x * (i+1);
			// x�� ���������� (i+1)�� x�� 2... 3...�踦 �����ش�.	
			}
		
			return answer;
			
		}

	}