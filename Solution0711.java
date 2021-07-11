package july;

import java.util.Arrays;
import java.util.Comparator;

public class Solution0711 {
    public String[] solution(String[] strings, int n) {
      Arrays.sort(strings, new Comparator<>() {
		//strings배열을 정렬시킨다 Comparator인터페이스 사용
			@Override
			public int compare(String s1,String s2) {
				//음수 양수로 값 전환
				if(s1.charAt(n)==s2.charAt(n)) {
					//s1 s2 n번째 글자 비교 같을경우
					
					return s1.compareTo(s2);
					//s1:기준값[c] s2:비교대상[c] 일때 -1 리턴
					//s1 s2의 모든 글자 값 비교후 값 리턴
					
				}else {
				return s1.charAt(n) - s2.charAt(n);
					//s1 값[c] s2 값[x] x-c = 21 리턴
				}
			}
		});
		 			 
        return strings;
    }
}

/* 다른사람 풀이
String[] answer = {};
ArrayList<String> arr = new ArrayList<>();
for (int i = 0; i < strings.length; i++) {
    arr.add("" + strings[i].charAt(n) + strings[i]);
}
Collections.sort(arr);
answer = new String[arr.size()];
for (int i = 0; i < arr.size(); i++) {
    answer[i] = arr.get(i).substring(1, arr.get(i).length());
}
    */
