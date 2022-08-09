package Level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution210720 {
    public ArrayList solution(int[] numbers) {
Arrays.sort(numbers);
//�޴� �迭 ����

ArrayList<Integer> arr = new ArrayList();

for(int i=0; i<numbers.length-1;i++) {
	for(int j=i+1; j<numbers.length;j++) {
		if(!arr.contains(numbers[i]+numbers[j])){
			//������ ���� �� �߰�
			arr.add(numbers[i]+numbers[j]);				
		}
	}
}
        Collections.sort(arr);
        //ArrayList ����
        return arr;
    }
}