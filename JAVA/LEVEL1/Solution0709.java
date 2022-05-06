package july;

import java.util.Arrays;

public class Solution0709 {
    public String solution(String s) {
    
        String answer = "";
	    char[] arr = new char[s.length()];
	    
	    for(int i= 0 ; i<s.length();i++) {
	    	arr[i] = s.charAt(i);
	    } 
	    Arrays.sort(arr);
	    //글자따와서 정렬
	    for(int i= s.length()-1 ; i>=0;i--) {
	    	answer += arr[i];  
	    } //끝에서 부터 집어넣기
        return answer;
    }
}