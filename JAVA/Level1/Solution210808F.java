package Level1;

public class Solution210808F {
    public String solution(String new_id) {
		String id = new_id.toLowerCase();
		char[] list = id.toCharArray();
		String reg = "^[~!@#$%^&*()=+[{]}:?,<>/]$";
		String answer ="";
		for(int i=0;i<list.length;i++) {			
			if(Character.toString(list[i]).matches(reg)) continue;
				if(i<list.length-2) if(list[i]=='.' && list[i+1]=='.' && list[i+2]=='.') continue;
				if(i<list.length-1) if(list[i]=='.' && list[i+1]=='.') continue;				
			answer += list[i];
		}

		if(answer.equals("")) answer += "a";
		
		if(answer.length()==1 && answer.equals(".")) {
			answer="a" ;
		}else if(answer.substring(0,1).equals(".")) answer = answer.substring(1);
		
		while(answer.substring(answer.length()-1, answer.length()).equals(".")) {
			answer = answer.substring(0, answer.length()-1);
		}

		if(answer.length()<3) {
			while(answer.length()<3) {
				answer += answer.substring(answer.length()-1, answer.length());
			}
		}			

		if(answer.length()>=16) {
			while(answer.length()>=16) {
				answer = answer.substring(0, 15);
				if(answer.substring(0,1).equals(".")) answer = answer.substring(1);
				if(answer.substring(answer.length()-1, answer.length()).equals(".")) answer = answer.substring(0, answer.length()-1);
				if(answer.length()<3) {
					while(answer.length()<3) {
						answer += answer.substring(answer.length()-1, answer.length());
					}
				}
			}
		}
        return answer;
    }
}