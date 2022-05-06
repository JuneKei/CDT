package july;

public class Solution0707 {
    public String solution(String[] seoul) {
        String answer="";
		for(int i=0;i<seoul.length;i++){
			//배열 seoul 까지의 길이
            if(seoul[i].equals("Kim")){
            	//string 찾으므로 eqauls
            	answer= "김서방은 "+i+"에 있다";
                break;
            }
        }
        
        return answer;
    }
}