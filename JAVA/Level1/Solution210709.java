package Level1;

import java.util.Arrays;

public class Solution210709 {
    public String solution(String s) {
    
        String answer = "";
	    char[] arr = new char[s.length()];
	    
	    for(int i= 0 ; i<s.length();i++) {
	    	arr[i] = s.charAt(i);
	    } 
	    Arrays.sort(arr);
	    //���ڵ��ͼ� ����
	    for(int i= s.length()-1 ; i>=0;i--) {
	    	answer += arr[i];  
	    } //������ ���� ����ֱ�
        return answer;
    }
}