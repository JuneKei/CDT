package july;
import java.util.Arrays;
public class Solution0713 {
    public int[] solution(int[] arr, int divisor) {
        int cnt = 0; 
        int[] answer = {};
         Arrays.sort(arr);
		for(int i=0 ; i<arr.length;i++) {
			if(arr[i]%divisor==0) {
				cnt++;
			}
        }
        if(cnt==0) {
         answer = new int[1];
        answer[0] = -1;
        }else{
         answer = new int[cnt];
			for(int i=0 , j=0; i<arr.length;i++) {
				if(arr[i]%divisor==0) {
					answer[j]=arr[i];
					j++;
				}
			}
        }
        return answer;
    }
}

//return Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray();
