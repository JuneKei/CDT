package codingtest;

public class Solution0701 {
    public int[] solution(int n, int m) {
		int temp; 
		int[] answer= new int[2];		
		int result = 0;
			 if(n>m) {
				 temp=n;
				 n=m;
				 m=temp;
			 }
			 //n 과 m 의 최소값으로 변환

		for(int i=1; i<=m;i++) { 
			//1부터 증가시키며 동시에 0이되는 수를  찾음
			if( n%i==0 && m%i==0) {
				answer[0]= i;
			}
		}
		answer[0]=result;
		answer[1]=(n*m)/result;
		//최소 공배수는 둘의 곱을 나눈값
        return answer;
    }
}


