package july;

public class Solution0708 {
    public boolean solution(String s) {
   
        boolean answer = false;
		 int l = s.length();
		 String reg="^[0-9]+$";
	
		if(l==4||l==6) {
			if(s.matches(reg)) {
				answer= true;
			}
			}
        
        return answer;
    }
}