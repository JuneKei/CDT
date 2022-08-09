package Level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution210801 {
    public int[] solution(int n, int[] stages) {
        int[] answer = new int[n];
		Map<Integer, Float> map = new HashMap<Integer, Float>();
		
		for(int i=1;i<=n;i++) {
			int cnt = 0;
			int lcnt = 0;
			for(int j=0;j<stages.length;j++) {
				if(stages[j]>i-1)lcnt++;
				if(stages[j]==i)cnt++;
			}
            if(lcnt == 0) {
				lcnt = 1;
			}
			map.put(i,cnt/(float)lcnt);					
		}
		
		List<Integer> list = new ArrayList<>(map.keySet());
		Collections.sort(list,(o1,o2) -> (map.get(o2).compareTo(map.get(o1))));
		int i=0;
		for(Integer key : list) {
			answer[i]=key;
			i++;
		}
        return answer;
    }
}