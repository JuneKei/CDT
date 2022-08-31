//줄 서는 방법
import java.util.ArrayList;

class Solution220831 {
    public static int[] solution(int n, long k) {
        int[] answer = new int[n];
        ArrayList<Integer> arr = new ArrayList<>();
        long nFactorial = 1;

        for (int i = 1; i <= n; i++) {
            // 1~n값 리스트에 추가
            arr.add(i);
            // n의 Factorial 값 계산
            nFactorial *= i;
        }
        // 배열은 0~n 이므로 k -1
        k = k - 1;
        for (int i = 0; i < n; i++) {
            // n!/(n-1)
            nFactorial = nFactorial / (n - i);
            
            int num = (int) (k / nFactorial);
            //배열에 값 추가
            answer[i] = arr.get(num);
            arr.remove(num);

            k = k % nFactorial;
        }

        return answer;
    }
    public static void main(String[] args) {
        solution(4,3);
    }
}
