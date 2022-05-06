package july;

public class Solution0729 {
    public int solution(String s) {
        //숫자를 영어로 바꾸는 방법도 ...
        String temp = "";
		
		String answer = "";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>=48 && s.charAt(i)<=57) {
				answer +=  s.charAt(i);
			}else {
				temp += s.charAt(i);
				switch(temp) {
				case "zero" : answer += "0"; temp=""; break; 
				case "one" : answer += "1"; temp=""; break; 
				case "two" : answer += "2"; temp=""; break; 
				case "three" : answer += "3"; temp=""; break; 
				case "four" : answer += "4"; temp=""; break; 
				case "five" : answer += "5"; temp=""; break; 
				case "six" : answer += "6"; temp=""; break; 
				case "seven" : answer += "7"; temp=""; break; 
				case "eight" : answer += "8"; temp=""; break; 
				case "nine" : answer += "9"; temp=""; break; 
				}
			}
		}
		int number = Integer.parseInt(answer);
        return number;
    }
}