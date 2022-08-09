package Level1;

public class Solution210628 {
    public String solution(String phone_number) {
        String answer = "";
        
        String x= phone_number.substring(0, phone_number.length()-4);
        //substring ���� 0~ ������4�ڸ� ���� ���� ���� 
        x= x.replaceAll("[0-9]", "*");
        // 0~9 ���Խ� ����Ͽ� *�� ��ȯ
        
        String y= phone_number.substring(phone_number.length()-4, phone_number.length());
        // ������ 4�ڸ� �� ����
        
        answer=x+y;
        return answer;
    }
}