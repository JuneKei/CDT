package Level1;

import java.util.Arrays;
import java.util.Comparator;

public class Solution210711 {
    public String[] solution(String[] strings, int n) {
      Arrays.sort(strings, new Comparator<>() {
		//strings�迭�� ���Ľ�Ų�� Comparator�������̽� ���
			@Override
			public int compare(String s1,String s2) {
				//���� ����� �� ��ȯ
				if(s1.charAt(n)==s2.charAt(n)) {
					//s1 s2 n��° ���� �� �������
					
					return s1.compareTo(s2);
					//s1:���ذ�[c] s2:�񱳴��[c] �϶� -1 ����
					//s1 s2�� ��� ���� �� ���� �� ����
					
				}else {
				return s1.charAt(n) - s2.charAt(n);
					//s1 ��[c] s2 ��[x] x-c = 21 ����
				}
			}
		});
		 			 
        return strings;
    }
}

/* �ٸ���� Ǯ��
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
