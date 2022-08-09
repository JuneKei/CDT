package Level1;

public class Solution210702 {
    public String solution(int num) {
        String answer = (num%2==0) ? "Even" : "Odd";        
        // 삼항연산자 사용해서 짝수면 Even
        return answer;
    }
}

/*
def solution(num):
    answer = "Odd" if num%2==1 else "Even"
    return answer
s*/
