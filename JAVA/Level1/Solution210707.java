package Level1;

public class Solution210707 {
    public String solution(String[] seoul) {
        String answer="";
		for(int i=0;i<seoul.length;i++){
			//�迭 seoul ������ ����
            if(seoul[i].equals("Kim")){
            	//string ã���Ƿ� eqauls
            	answer= "�輭���� "+i+"�� �ִ�";
                break;
            }
        }
        
        return answer;
    }
}