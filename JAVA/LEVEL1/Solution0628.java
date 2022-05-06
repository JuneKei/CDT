package codingtest;

public class Solution0628 {
    public String solution(String phone_number) {
        String answer = "";
        
        String x= phone_number.substring(0, phone_number.length()-4);
        //substring 으로 0~ 마지막4자리 이하 값을 받음 
        x= x.replaceAll("[0-9]", "*");
        // 0~9 정규식 사용하여 *로 변환
        
        String y= phone_number.substring(phone_number.length()-4, phone_number.length());
        // 마지막 4자리 값 받음
        
        answer=x+y;
        return answer;
    }
}