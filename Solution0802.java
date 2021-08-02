package august;

public class Solution0802 {
    public String solution(int[] numbers, String hand) {
        String answer = "";
       	int left=10;
		int right=12;
		
		String[] list = new String[numbers.length];
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==0) numbers[i]=11;
			if(numbers[i]%3==1) {
				answer +="L";
				left=numbers[i];
			}else if(numbers[i]%3==0) {
				answer +="R";
				right=numbers[i];
			}else {
				// 2,5,8,0 일때 현재 left 에 해당하는 값
                int minusL = Math.abs(numbers[i]-left); 
                //ex 5 : num 4 = 1
				int minusR = Math.abs(numbers[i]-right); 
                //ex 5 : num 2 = 3 
				int distanceL = (minusL % 3) + (minusL /3); 
                // 1 + 1 [1열 이기때문에 1] + [2행 이라 1]
				int distanceR = (minusR % 3) + (minusR /3); 
                // 2 + 0 [2열 이기떄문에 2] + [1행 이라 0]
				if( distanceL < distanceR) {
					answer +="L";
					left = numbers[i];
				} else if( distanceR < distanceL) {
					answer += "R";
					right= numbers[i];
				} else {
					answer += hand.equals("right") ? "R" : "L";
					if(hand.equals("right")) right = numbers[i];
					else left = numbers[i];
				}
			}
		}
        return answer;
    }
}