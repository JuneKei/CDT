package july;

import java.util.ArrayList;
import java.util.Collections;

public class Solution0724 {
    public int[] solution(int[] array, int[][] commands) {
       int[] answer = new int[commands.length];
		
		for(int i=0;i<answer.length;i++) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			int zero= commands[i][0]-1;
			int one = commands[i][1]-zero;
				for(int j=0;j<one;j++) {
					list.add(array[zero]);
					zero++;
				}
				Collections.sort(list);
			answer[i]=list.get(commands[i][2]-1);
		}
        return answer;
    }
}