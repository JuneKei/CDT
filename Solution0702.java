package codingtest;

public class Solution0702 {
    public String solution(int num) {
        String answer = (num%2==0) ? "Even" : "Odd";        
        // 삼항연산자 사용해서 짝수면 Even
        return answer;
    }
}


