package Level1;

public class Solution210718 {
    public String solution(String s) {
        int n= s.length();
	String answer = n%2==0 
			?s.substring(n/2-1,n/2+1)
					:s.substring(n/2,n/2+1);	
        return answer;
    }
}