package july;

import java.util.ArrayList;

public class Solution0714 {
    public int[] solution(int []arr) {
      
        ArrayList<Integer> list= new ArrayList<>();
	
		list.add(arr[0]);
	    //첫번째 먼저 담기
        for (int i = 1; i < arr.length; i++) {

			if (arr[i - 1] != arr[i]) {
            //같지않을경우 배열에 담기
				list.add(arr[i]);
			} 
		}
        
		int[] answer=new int[list.size()];
        //ArrayList 배열로 변환
        int size=0;
		for(Integer i : list) {
			answer[size++]=i;
		}
        return answer;
    }
}