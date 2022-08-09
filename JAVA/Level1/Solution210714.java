package Level1;

import java.util.ArrayList;

public class Solution210714 {
    public int[] solution(int []arr) {
      
        ArrayList<Integer> list= new ArrayList<>();
	
		list.add(arr[0]);
	    //ù��° ���� ���
        for (int i = 1; i < arr.length; i++) {

			if (arr[i - 1] != arr[i]) {
            //����������� �迭�� ���
				list.add(arr[i]);
			} 
		}
        
		int[] answer=new int[list.size()];
        //ArrayList �迭�� ��ȯ
        int size=0;
		for(Integer i : list) {
			answer[size++]=i;
		}
        return answer;
    }
}