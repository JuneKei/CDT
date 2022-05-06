package july;

public class Solution0721 {
    public int solution(int n) {
        String s ="";
	    //3진법  n에서 시작해서 나머지를 구하고 나머지 값을 구함
	    for(int i=n;i>0;i/=3) {
		    s += (i%3); 
	    }
	    char[] arr = s.toCharArray();
	    //char에 담고 해당값 *3
	    int answer = 0;
	    for(int i=s.length()-1,j=1;i>=0;i--,j*=3) {
		answer += (arr[i]-48) *j;
	}
        return answer;
    }
}