package codingtest;

import java.util.Arrays;

class Solution0703 {
    public long solution(long n) {
    	String x= String.valueOf(n);
			//��Ʈ������ ��ȯ��Ű��
		String[] arr = new String[x.length()];
			//String �迭�� String���� ������ �����
		for(int i=0;i<arr.length;i++) {
			arr[i]=Character.toString(x.charAt(i));		
		}
		// i �� �ش��ϴ� ���� �ϳ��� �ֱ�
		
		Arrays.sort(arr);
		//arr �迭�� ������ ������ ����
		x="";
		//x���� �ʱ�ȭ ��Ű��
		for(int i=arr.length-1;i>=0;i--) {
			x += arr[i];	
		}
		//�ڿ� ���ں��� �����鼭 ��������
		n=Long.parseLong(x);
		//String �� Long���� ��ȯ
        return n;
    }
}