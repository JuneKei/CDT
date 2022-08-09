package Level1;

public class Solution210701 {
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
		result=answer[0];
		answer[1]=(n*m)/result;
		//최소 공배수는 둘의 곱을 나눈값
        return answer;
    }
}

/*
def solution(n, m):
    m0=m1=m2=0
    for i in range(1,max(n,m)):
       if (n%i==0) & (m%i==0) :
           m0=i
           m1=n/i
           m2=m/i
    answer=[m0,int(m0*m1*m2)]

    return answer
*/
