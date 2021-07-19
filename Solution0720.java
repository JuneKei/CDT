package july;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution0720 {
    public ArrayList solution(int[] numbers) {
Arrays.sort(numbers);
//받는 배열 정렬

ArrayList<Integer> arr = new ArrayList();

for(int i=0; i<numbers.length-1;i++) {
	for(int j=i+1; j<numbers.length;j++) {
		if(!arr.contains(numbers[i]+numbers[j])){
			//같은값 없을 때 추가
			arr.add(numbers[i]+numbers[j]);				
		}
	}
}
        Collections.sort(arr);
        //ArrayList 정렬
        return arr;
    }
}