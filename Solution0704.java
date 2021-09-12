package july;

public class Solution0704 {
    public int solution(int n) {
    
    	int x=0;
    	
		for(int i=0;i<(int)(Math.log10(n)+1);i++) {
		//(int)(Math.log(n)+1) int n의 길이
			
			x+=(Integer.toString(n).charAt(i)-48);
			//n을 toString[문자] -> charAt으로[문자 뽑기]
			// -48을 안하면 5일때 아스키코드값 53으로 읽음
		}
        return n;
    }
}

def solution(n):
    answer = 0
    for i in str(n):
        answer+=int(i)
    return answer
